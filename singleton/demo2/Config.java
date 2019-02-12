package demo2;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

//每次获取配置文件内的信息都需要频繁创建Config对象，浪费资源，于是使用单例模式。
public class Config {
	private Properties properties = new Properties();
	
	//创建类成员和类方法
	private static Config conf = new Config();
	
	public static Config getUniqueInstance(){
		return conf;
	}
	
	private Config(){
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
