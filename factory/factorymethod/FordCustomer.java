package factorymethod;

import abstractfactory.Car;
import abstractfactory.FordCarFactory;

public class FordCustomer extends Customer {

	@Override
	protected Car getCar() {
		return new FordCarFactory().newCar();
	}

}
