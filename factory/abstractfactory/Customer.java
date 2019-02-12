package abstractfactory;

public class Customer {
	private Car car;
	
	public Customer() {
	}
	
	public void buyCar(SSSS ssss){
		car = ssss.sellCar();
	}
	
	public void drive(){
		System.out.println("周末自驾游");
		car.run();
		System.out.println("真开心");
	}
}
