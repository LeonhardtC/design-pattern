package factory.method;

import factory.abs.Car;
import factory.abs.FordCarFactory;

public class FordCustomer extends Customer {

    @Override
    protected Car getCar() {
        return new FordCarFactory().newCar();
    }

}
