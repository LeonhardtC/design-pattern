package demo2;

import demo2.Woman;

public class DressUpWoman extends WrapperWoman {

	public DressUpWoman(Woman woman) {
		super(woman);
	}
	
	@Override
	public int getBeauty() {
		return super.getBeauty()+20;
	}
}
