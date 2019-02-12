package factorymethod;

import abstractfactory.Car;
import abstractfactory.HondaCarFactory;

public class HondaCustomer extends Customer {

	@Override
	protected Car getCar() {
		return new HondaCarFactory().newCar();
	}

}
