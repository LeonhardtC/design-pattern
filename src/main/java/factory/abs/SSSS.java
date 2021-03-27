package factory.abs;

public class SSSS {
    private CarFactory carFactory;

    public Car sellCar() {
        return carFactory.newCar();
    }

    public CarFactory getCarFactory() {
        return carFactory;
    }

    public void setCarFactory(CarFactory carFactory) {
        this.carFactory = carFactory;
    }
}
