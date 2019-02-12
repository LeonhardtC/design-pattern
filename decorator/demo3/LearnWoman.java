package demo3;

public class LearnWoman extends WrapperWoman {
	
	public LearnWoman(IWoman woman) {
		super(woman);
	}
	
	@Override
	public int getIq() {
		return super.getIq()+20;
	}
	
}
