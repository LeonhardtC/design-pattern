package builder;

public class testBuilder {

    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilder();
        builder.setOs("linux");
        builder.toString();
//		builder.setOffice("office");
//		builder.setChat("msn");
        System.out.println(builder);
        System.out.println(builder.build());
    }
}
