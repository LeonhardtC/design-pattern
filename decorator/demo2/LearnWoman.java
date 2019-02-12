package demo2;

public class LearnWoman extends WrapperWoman {
	
	public LearnWoman(Woman woman) {
		super(woman);
	}
	
	@Override
	public int getIq() {
		return super.getIq()+20;
	}
	
}
