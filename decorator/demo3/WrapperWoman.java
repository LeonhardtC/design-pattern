package demo3;

//抽取出来的公共类，减少代码重写
public class WrapperWoman implements IWoman {
	//在内部持有一个Woman变量
	private IWoman woman;

	public WrapperWoman(IWoman woman) {
		this.woman = woman;
	}

	//调用持有对象woman原有方法
	@Override
	public int getBeauty() {
		return woman.getBeauty();
	}

	@Override
	public int getIq() {
		return woman.getIq();
	}

	@Override
	public String getName() {
		return woman.getName();
	}

	@Override
	public void say() {
		woman.say();
	}
}
