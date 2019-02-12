package loader;

public class Coder implements Person{

	public void code(){
		System.out.println("编码");
	}

	@Override
	public void say() {
		System.out.println("I am coder");
	}
	
}
