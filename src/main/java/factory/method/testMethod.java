package factory.method;

public class testMethod {
    public static void main(String[] args) throws Exception {
        //新建一个顾客
        Customer customer = new factory.method.BenzCustomer();
        customer.drive();
    }
}
