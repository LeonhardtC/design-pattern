package demo2;

//继承的方式
public class testWoman {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建一个普通的女人
		Woman fengjie = new Woman("凤姐",50,80);
		System.out.println(fengjie.getBeauty());
		System.out.println(fengjie.getIq());
		fengjie.say();
		System.out.println("------------------------");
		
		//化妆的女人
		Woman fengjie1 = new DressUpWoman(fengjie);
		System.out.println(fengjie1.getBeauty());
		System.out.println(fengjie1.getIq());
		fengjie1.say();
		System.out.println("------------------------");
		
		//学习的女人
		Woman fengjie2 = new LearnWoman(fengjie);
		System.out.println(fengjie2.getBeauty());
		System.out.println(fengjie2.getIq());
		fengjie2.say();
		System.out.println("------------------------");
		
		//有教养的女人
		Woman fengjie3 = new PoliteWoman(fengjie);
		System.out.println(fengjie3.getBeauty());
		System.out.println(fengjie3.getIq());
		fengjie3.say();
		System.out.println("------------------------");
		
		//有化妆，又学习的女人
		Woman fengjie4 = new LearnWoman(new DressUpWoman(fengjie));
		System.out.println(fengjie4.getBeauty());
		System.out.println(fengjie4.getIq());
		fengjie4.say();
		
		//思考：通过内部持有一个被装饰的对象，继承该对象，通过重写来装饰该对象的方法。使得能任意组合、重复使用。
		//这就是装饰者模式Decorator。
		//例子：IO流，servlet对request的包装。
		
	}

}
