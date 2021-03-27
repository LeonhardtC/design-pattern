package factory.abs;

public class BenzCar implements Car {

    @SuppressWarnings("unused")
    private int price;

    public BenzCar(int price) {
        this.price = price;
    }

    @Override
    public void run() {
        System.out.println("我是奔驰汽车，我在路上跑");
    }

}
