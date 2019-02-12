package demo1;

public class DressUpWoman extends Woman {
	
	public DressUpWoman(String name, int beauty, int iq) {
		super(name, beauty, iq);
	}

	@Override
	public int getBeauty() {
		return super.getBeauty()+20;
	}
}
