package factory.abs;

public class BenzCarFactory implements CarFactory {

    @Override
    public Car newCar() {
        return new BenzCar(1000000);
    }
}
