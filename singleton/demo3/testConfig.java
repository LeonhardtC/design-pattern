package demo3;

public class testConfig {
	public static void main(String[] args) {
//		Properties properties = new Properties();
//		try {
//			properties.load(new FileInputStream(new File("singleton/demo2/config.properties")));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(properties.get("name"));
		
		Config5 conf = Config5.getUniqueInstance();
		System.out.println(conf.getProperties("name"));
		
		System.out.println(Config5.getUniqueInstance());
		System.out.println(Config5.getUniqueInstance());
	}
}
