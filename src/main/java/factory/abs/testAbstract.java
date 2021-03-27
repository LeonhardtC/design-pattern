package factory.abs;


public class testAbstract {
    public static void main(String[] args) throws Exception {

        //新建一个4S店
        SSSS ssss = new SSSS();
        //创建一个汽车工厂设置给4S店
        ssss.setCarFactory(new HondaCarFactory());

        //创建一个客户
        Customer customer = new Customer();
        //顾客到4S店买车上路
        customer.buyCar(ssss);
        customer.drive();

        System.out.println("***********************");

        //另一种4S店，确定了品牌，所以和工厂紧密耦合
        ssss = new BenzSSSS();
        customer = new Customer();
        //顾客到4S店买车上路
        customer.buyCar(ssss);
        customer.drive();

    }
}
