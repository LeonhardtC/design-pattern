package aop.simple;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * Spring AOP和AspectJ都有AOP
 * AOP利用了动态代理，但AOP不仅仅是动态代理
 */
public class AopBuilder {
	
	// 维护一个目标对象
	private Object target;
	
	private static Properties properties = new Properties();
	
	private static Map<String, String> ruleMap = new HashMap<String, String>();
	
	//初始化
	static{
		try {
			properties.load(AopBuilder.class.getResourceAsStream("config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		String ruleConfig = properties.getProperty("rule");
		if(ruleConfig != null) {
			String[] rules = ruleConfig.split(",");
			for(String rule : rules){
				String[] detail = rule.split(":");
				ruleMap.put(detail[0], detail[1]);
			}
		}
	}
	
	public AopBuilder(Object target){
		this.target = target;
	}
	
	// 给目标对象创建代理对象
	public Object build(){
		//1. 工具类
		Enhancer en = new Enhancer();
		//2. 设置父类
		en.setSuperclass(target.getClass());
		//3. 设置回调函数(创建代理对象时候执行下面的方法)
		en.setCallback(new MethodInterceptor() {
			
			@Override
			public Object intercept(Object obj, Method method, Object[] args,
					MethodProxy proxy) throws Throwable {
				
				String key1 = obj.getClass().getSuperclass().getName()+"-"+method.getName();
				String key2 = obj.getClass().getSuperclass().getName()+"-"+"*";

				if(!ruleMap.containsKey(key1) && !ruleMap.containsKey(key2)){
					return method.invoke(target, args);
				}
				
				if("before".equals(ruleMap.get(key1)) || "before".equals(ruleMap.get(key2))){
					System.out.println("前置处理");
					return method.invoke(target, args);
				}
				
				if("after".equals(ruleMap.get(key1)) || "after".equals(ruleMap.get(key2))){
					Object value = method.invoke(target, args);
					System.out.println("后置处理");
					return value;
				}
				
				if("around".equals(ruleMap.get(key1)) || "around".equals(ruleMap.get(key2))){
					System.out.println("前置处理");
					Object value = method.invoke(target, args);
					System.out.println("后置处理");
					return value;
				}
				
				return method.invoke(target, args);
			}
		});
		//4. 创建子类(代理对象)
		return en.create();
	}
}
