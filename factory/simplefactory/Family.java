package simplefactory;

public class Family {
	private Car car;
	
	public Family(Car car) {
		this.car = car;
	}
	
	public void play(){
		System.out.println("周末自驾游");
		car.run();
		System.out.println("真开心");
	}
}
