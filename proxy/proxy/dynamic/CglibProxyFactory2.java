package proxy.dynamic;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxyFactory2 {
	
	// 维护一个目标对象
	private Class<?> clazz;
	
	public CglibProxyFactory2(Class<?> clazz){
		this.clazz = clazz;
	}
	
	// 给目标对象创建代理对象
	public Object getProxyInstance(){
		//1. 工具类
		Enhancer en = new Enhancer();
		//2. 设置父类
		en.setSuperclass(clazz);
		//3. 设置回调函数(创建代理对象时候执行下面的方法)
		en.setCallback(new MethodInterceptor() {
			
			@Override
			public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
				
				System.out.println("method "+method.getName()+" begin");
				
				Object returnValue = proxy.invokeSuper(obj, args);
				
				System.out.println("method "+method.getName()+" end");
				return returnValue;
			}
		});
		//4. 创建子类(代理对象)
		return en.create();
	}

}
