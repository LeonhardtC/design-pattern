package decorator.demo1;

public class LearnWoman extends Woman {

    public LearnWoman(String name, int beauty, int iq) {
        super(name, beauty, iq);
    }

    @Override
    public int getIq() {
        return super.getIq() + 20;
    }
}
