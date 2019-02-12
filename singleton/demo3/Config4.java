package demo3;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

//饱汉式，在config3基础上将synchronized放到if代码块，用类名上锁，第二次判断是防止在有多个线程进入第一个if。
//这种方式没有多线程问题，也叫双重锁。
public class Config4 {
	private Properties properties = new Properties();
	
	//创建类成员和类方法
	private static Config4 conf;
	
	public static Config4 getUniqueInstance(){
		if(conf == null){
			synchronized(Config4.class) {
				if(conf == null){
					conf = new Config4();
				}
			}
		}
		return conf;
	}
	
	private Config4(){
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
