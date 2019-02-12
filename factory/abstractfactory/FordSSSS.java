package abstractfactory;

public class FordSSSS extends SSSS {
	
	public FordSSSS(){
		super.setCarFactory(new FordCarFactory());
	}
}
