package singleton.demo1;

public class testSun {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //由于构造方法私有，所以不能创建
//		Sun sun = new Sun();

        Sun.getUniqueInstance().shine();

        //获得的对象是同一个
        System.out.println(Sun.getUniqueInstance());
        System.out.println(Sun.getUniqueInstance());
    }

}
