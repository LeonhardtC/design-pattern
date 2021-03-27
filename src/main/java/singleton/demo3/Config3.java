package singleton.demo3;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

//饱汉式，在config2基础上获取实例方法上加上synchronized上锁，解决了多线程时可能产生多个实例的问题。
//不过由于上锁，每次只能有1个线程获取实例，多线程时会导致系统卡死，严禁使用。
public class Config3 {
    private Properties properties = new Properties();

    //创建类成员和类方法
    private static Config3 conf;

    public static synchronized Config3 getUniqueInstance() {
        if (conf == null) {
            conf = new Config3();
        }
        return conf;
    }

    private Config3() {
        try {
            properties.load(new FileInputStream(new File("singleton/demo2/config.properties")));
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public String getProperties(String name) {
        return properties.getProperty(name);
    }

}
