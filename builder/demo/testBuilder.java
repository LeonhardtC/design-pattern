package demo;

public class testBuilder {

	public static void main(String[] args) {
		ComputorBuilder builder = new ComputorBuilder();
		builder.setOs("linux");
		builder.toString();
//		builder.setOffice("office");
//		builder.setChat("msn");
		System.out.println(builder);
		System.out.println(builder.build());
	}
}
