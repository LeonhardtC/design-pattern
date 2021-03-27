package proxy.dynamic;

import proxy.stc.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JayProxy {

	private static Jay jay = new Jay();

	public static Jay newInstance() {
		//JDK动态生成字节码，testJDKProxy$1.class
		Object proxy = Proxy.newProxyInstance(
				JayProxy.class.getClassLoader(),
				new Class[]{Person.class, Singer.class},
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

						String name = method.getName();
						System.out.println("method " + name + " begin");

						//被代理对象
						Object result = method.invoke(jay, args);

						System.out.println("method " + name + " end");

						return result;
					}
				});
		return (Jay) proxy;
	}
}
