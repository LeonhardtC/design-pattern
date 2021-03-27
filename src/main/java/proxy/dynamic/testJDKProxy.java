package proxy.dynamic;

import proxy.stc.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class testJDKProxy {

	public static void main(String[] args) {
		//JDK动态生成字节码，testJDKProxy$1.class
		Object proxy = Proxy.newProxyInstance(
				testJDKProxy.class.getClassLoader(),
				new Class[]{Person.class, Singer.class},
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

						System.out.println("method " + method.getName() + " begin");
						if ("say".equals(method.getName())) {
							System.out.println("我是成年人");
						}
						System.out.println("method " + method.getName() + " end");

						return null;
					}
				});

		//invoke中没定义的基本没有，如hashCode,toString
		System.out.println(proxy.getClass() + ":" + proxy);

		if (proxy instanceof Person) {
			((Person) proxy).say();
		}
		if (proxy instanceof Singer) {
			((Singer) proxy).sing();
		}
	}
}
