package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class JDKProxyFactory {

    // 维护一个目标对象
    private Object target;

    public JDKProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args)
                            throws Throwable {
                        System.out.println("method " + method.getName() + " begin");

                        // 执行目标对象方法
                        Object returnValue = method.invoke(target, args);

                        System.out.println("method " + method.getName() + " end");
                        return returnValue;
                    }
                });
    }
}











