package demo3;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

//饱汉式，获取实例时才加载，由于多线程机制可能会导致产生多个config，单例失效，不能使用。
public class Config2 {
	private Properties properties = new Properties();
	
	//创建类成员和类方法
	private static Config2 conf;
	
	public static Config2 getUniqueInstance(){
		if(conf == null){
			conf = new Config2();
		}
		return conf;
	}
	
	private Config2(){
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
