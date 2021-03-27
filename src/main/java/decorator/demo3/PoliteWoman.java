package decorator.demo3;

public class PoliteWoman extends WrapperWoman {

    public PoliteWoman(IWoman woman) {
        super(woman);
    }

    @Override
    public void say() {
        System.out.println("大家好");
        super.say();
        System.out.println("请多多关照");
    }

}
