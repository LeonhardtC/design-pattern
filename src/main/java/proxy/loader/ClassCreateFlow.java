package proxy.loader;

import lombok.Cleanup;
import sun.misc.ProxyGenerator;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@SuppressWarnings("restriction")
public class ClassCreateFlow {

	private static final String path = "C:/Workplace/learn/DesignPattern/path/";

	public static void main(String[] args) throws Exception {
		createJavaFile();
		compile();
		instance();
		clean();

		//JDKProxy生成字节码方式
		createClassFileByJDKProxy();
	}

	private static void createJavaFile() throws IOException {
		Files.copy(Paths.get(path, "Coder$Proxy.txt"), Paths.get(path, "Coder$Proxy.java"), StandardCopyOption.REPLACE_EXISTING);    //JDK1.7 NIO2文件流方式
	}

	/*
	 * 依赖jdk中的tool包
	 */
	private static void compile() throws IOException {
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		@Cleanup
		StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
		Iterable<? extends JavaFileObject> iterable = manager.getJavaFileObjects(path + "Coder$Proxy.java");
		CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
		task.call();
	}

	private static void instance() throws Exception {
		Class<?> clazz = new MyClassLoader().loadClass("loader.Coder$Proxy");
		Coder coder = (Coder) clazz.newInstance();
		coder.code();
	}

	private static void clean() throws IOException {
		Files.delete(Paths.get(path, "Coder$Proxy.java"));
		Files.delete(Paths.get(path, "Coder$Proxy.class"));
	}

	private static void createClassFileByJDKProxy() throws IOException {
		byte[] proxyClass = ProxyGenerator.generateProxyClass("Coder$JDKProxy", new Class[]{Person.class});
		Files.write(Paths.get(path + "Coder$JDKProxy.class"), proxyClass);
	}
}
