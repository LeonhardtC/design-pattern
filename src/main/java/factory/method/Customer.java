package factory.method;

import factory.abs.BenzCarFactory;
import factory.abs.Car;

public abstract class Customer {

    public void drive() {
        System.out.println("周末自驾游");
        getCar().run();
        System.out.println("真开心");
    }

    //工厂方法：不知道所需对象具体是怎么产生的，但知道该对象接口，要去使用，先定义一个方法 ，在子类实现去调用。
    //1:用抽象方法
    protected abstract Car getCar();

    //2:返回一个默认的对象
    protected Car getDefaultCar() {
        return new BenzCarFactory().newCar();
    }
}
