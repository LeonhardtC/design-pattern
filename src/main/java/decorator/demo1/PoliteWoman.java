package decorator.demo1;

public class PoliteWoman extends Woman {

    public PoliteWoman(String name, int beauty, int iq) {
        super(name, beauty, iq);
    }

    @Override
    public void say() {
        System.out.println("大家好");
        super.say();
        System.out.println("请多多关照");
    }

}
