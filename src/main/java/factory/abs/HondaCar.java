package factory.abs;

public class HondaCar implements Car {

    @Override
    public void run() {
        System.out.println("我是本田汽车，我在路上跑");
    }

}
