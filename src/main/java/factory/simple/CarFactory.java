package factory.simple;

import java.io.IOException;
import java.util.Properties;

public class CarFactory {
    private static Properties properties = new Properties();

    static {
        try {
            properties.load(CarFactory.class.getResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private CarFactory() {
    }

    ;

    @Deprecated
    public static Car getCar(String carName) {
        if ("FordCar".equals(carName)) {
            return new FordCar();
        } else if ("HondarCar".equals(carName)) {
            return new HondaCar();
        } else if ("BenzCar".equals(carName)) {
            return new BenzCar();
        } else {
            return null;
        }
    }

    //利用配置文件的方式进一步解耦
    //缺点：使用反射必要要对象有无参构造函数才行
    public static Car getNewCar() throws Exception {
        String carName = properties.getProperty("carName");
        @SuppressWarnings("unchecked")
        Class<Car> clazz = (Class<Car>) Class.forName(carName);
        Car car = clazz.newInstance();    //调用无参构造函数
        return car;
    }

}
