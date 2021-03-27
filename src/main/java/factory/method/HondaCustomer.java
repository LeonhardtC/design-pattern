package factory.method;

import factory.abs.Car;
import factory.abs.HondaCarFactory;

public class HondaCustomer extends Customer {

    @Override
    protected Car getCar() {
        return new HondaCarFactory().newCar();
    }

}
