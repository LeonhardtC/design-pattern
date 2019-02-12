package abstractfactory;

public class FordCarFactory implements CarFactory{
	
	@Override
	public Car newCar(){
		return new FordCar();
	}
}
