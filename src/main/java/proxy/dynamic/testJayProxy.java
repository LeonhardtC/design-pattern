package proxy.dynamic;

import proxy.stc.Person;

public class testJayProxy {

    public static void main(String[] args) {
        Object jdkProxy = new JDKProxyFactory(new Jay()).getProxyInstance();
//		Jay jay1 = (Jay) jdkProxy;	//强转失败
        ((Person) jdkProxy).say();
        ((Singer) jdkProxy).sing();
        System.out.println(jdkProxy);

        System.out.println("--------------------");

        Object cglibProxy = new CglibProxyFactory(new Jay()).getProxyInstance();
        Jay jay2 = (Jay) cglibProxy;
        jay2.say();
        jay2.sing();
        System.out.println(jay2);

        System.out.println("--------------------");
        Object cglibProxy2 = new CglibProxyFactory2(Jay.class).getProxyInstance();
        Jay jay3 = (Jay) cglibProxy2;
        jay3.say();
        jay3.sing();
        System.out.println(jay3);
    }
}
