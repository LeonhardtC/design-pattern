package proxy.loader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MyClassLoader extends ClassLoader {

    private final String path = "C:/Workplace/learn/DesignPattern/path/";

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class<?> clazz = null;
        try {
            byte[] data = getClassFileBytes(name);
            clazz = defineClass(name, data, 0, data.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clazz;
    }

    private byte[] getClassFileBytes(String name) throws IOException {
        String simpleName = name.substring(name.lastIndexOf(".") + 1);
        String fileName = path + simpleName + ".class";    //从classpath外加载类
        return Files.readAllBytes(Paths.get(fileName));    //JDK1.7 NIO2文件流方式
    }

}
