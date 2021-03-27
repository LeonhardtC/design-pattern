package singleton.demo3;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

//饱汉式，采用静态内部类的方式。
//这种方式也没有多线程问题，利用jvm加载类的机制，只有被使用的时候才加载。jvm加载方式改变时有风险。
public class Config5 {
    private Properties properties = new Properties();

    //静态内部类
    private static class InnerConfig5 {
        private static final Config5 conf = new Config5();
    }

    public static Config5 getUniqueInstance() {
        return InnerConfig5.conf;
    }

    private Config5() {
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
