package decorator.demo2;

//抽取出来的公共类，减少代码重写
public class WrapperWoman extends Woman {
    //在内部持有一个Woman变量
    private Woman woman;

    public WrapperWoman(Woman woman) {
        //由于woman没有无参构造方法，所以这里加个构造方法，实际没有任何意义
        super(woman.getName(), woman.getBeauty(), woman.getIq());
        this.woman = woman;
    }

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
