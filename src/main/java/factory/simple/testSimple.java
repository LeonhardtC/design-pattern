package factory.simple;


public class testSimple {
    public static void main(String[] args) throws Exception {

        /* 传统方式，即使使用了多态，当需求变更，仍要大量修改程序中new的对象，十分繁琐。
         * 考虑到日常使用风扇，电视等，并不需要关注它是怎么生产的（初始化参数），只需名字选择使用，是不是可以采用工厂来生产对象。
         */
//		Car car = new FordCar();
//		Car car = new HondaCar();
//		Car car = new BenzCar();
//		new Family(car).play();

        /* 使用工厂生产汽车，但名字固定，如更改还是比较麻烦，而且在CarFactory大量进行判断比较麻烦，对未知车型的支持也不好
         * 考虑在工厂中使用反射技术生成汽车。
         */
//		Car car = CarFactory.getCar("FordCar");
//		Car car = CarFactory.getCar("HondaCar");
//		Car car = CarFactory.getCar("BenzCar");
//		new Family(car).play();

        //使用反射生成对象
        Car car = CarFactory.getNewCar();
        new Family(car).play();
        System.out.println(BenzCar.class);
        System.out.println(CarFactory.class.getResource("").getPath());
        System.out.println(CarFactory.class.getClassLoader().getResource("").getPath());

        //简单工厂模式的另一种应用
        Student stu = Student.getInstance();
        stu.say();
    }
}
