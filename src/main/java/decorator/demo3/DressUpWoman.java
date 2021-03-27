package decorator.demo3;

public class DressUpWoman extends WrapperWoman {

    public DressUpWoman(IWoman woman) {
        super(woman);
    }

    @Override
    public int getBeauty() {
        return super.getBeauty() + 20;
    }
}
