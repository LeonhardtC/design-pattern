package decorator.demo1;

public class testWoman {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //创建一个普通的女人
//		Woman fengjie = new Woman("凤姐",50,80);
//		System.out.println(fengjie.getBeauty());
//		System.out.println(fengjie.getIq());
//		fengjie.say();

        //化妆的女人，通过继承重写这个方法
//		Woman fengjie = new DressUpWoman("凤姐",50,80);
//		System.out.println(fengjie.getBeauty());
//		System.out.println(fengjie.getIq());
//		fengjie.say();

        //学习的女人
//		Woman fengjie = new LearnWoman("凤姐",50,80);
//		System.out.println(fengjie.getBeauty());
//		System.out.println(fengjie.getIq());
//		fengjie.say();

        //有教养的女人
//		Woman fengjie = new PoliteWoman("凤姐",50,80);
//		System.out.println(fengjie.getBeauty());
//		System.out.println(fengjie.getIq());
//		fengjie.say();

        /*想要化妆，又学习的女人？
         * 1.继承DressUpWoman，重写getIq方法
         * 2.继承LearnWoman，重写getBeauty方法
         */
        Woman fengjie = new LearnDressUpWoman("凤姐", 50, 80);
        System.out.println(fengjie.getBeauty());
        System.out.println(fengjie.getIq());
        fengjie.say();

        //想要化妆，有教养的女人？想要学习，有教养的女人？或者都有的女人？
        /* 问题1：3个方法产生至少7个子类，方法越多子类数量指数上升，而且产生大量重复代码
         * 问题2：重写的方法无法重复使用，如化妆2次，多次
         * 思考：每个进行功能拓展的子类都只能维护其父类，能否将其维护的范围拓展到所有Woman类？
         */

    }

}
