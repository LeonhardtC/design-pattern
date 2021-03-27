package factory.method;

import factory.abs.BenzCarFactory;
import factory.abs.Car;

public class BenzCustomer extends Customer {

    @Override
    protected Car getCar() {
        return new BenzCarFactory().newCar();
    }

}
