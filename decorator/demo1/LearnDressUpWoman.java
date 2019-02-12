package demo1;

public class LearnDressUpWoman extends DressUpWoman {

	public LearnDressUpWoman(String name, int beauty, int iq) {
		super(name, beauty, iq);
	}
	
	@Override
	public int getIq() {
		return super.getIq()+20;
	}

}
