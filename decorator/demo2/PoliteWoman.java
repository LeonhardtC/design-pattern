package demo2;

public class PoliteWoman extends WrapperWoman {

	public PoliteWoman(Woman woman) {
		super(woman);
	}
	
	@Override
	public void say() {
		System.out.println("大家好");
		super.say();
		System.out.println("请多多关照");
	}

}
