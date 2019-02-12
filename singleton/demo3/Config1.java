package demo3;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

//饥汉式，和demo2中config一样，推荐使用。
public class Config1 {
	private Properties properties = new Properties();
	
	//创建类成员和类方法
	private static Config1 conf = new Config1();
	
	public static Config1 getUniqueInstance(){
		return conf;
	}
	
	private Config1(){
		try {
			properties.load(new FileInputStream(new File("singleton/demo2/config.properties")));
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public String getProperties(String name){
		return properties.getProperty(name);
	}
	
}
