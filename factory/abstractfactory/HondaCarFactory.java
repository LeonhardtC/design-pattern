package abstractfactory;

public class HondaCarFactory implements CarFactory{
	
	@Override
	public Car newCar(){
		return new HondaCar();
	}
}
