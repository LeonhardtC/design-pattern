package factorymethod;

import abstractfactory.BenzCarFactory;
import abstractfactory.Car;

public class BenzCustomer extends Customer {

	@Override
	protected Car getCar() {
		return new BenzCarFactory().newCar();
	}

}
