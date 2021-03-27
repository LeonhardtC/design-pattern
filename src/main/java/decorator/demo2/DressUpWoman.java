package decorator.demo2;

public class DressUpWoman extends WrapperWoman {

	public DressUpWoman(Woman woman) {
		super(woman);
	}

	@Override
	public int getBeauty() {
		return super.getBeauty() + 20;
	}
}
