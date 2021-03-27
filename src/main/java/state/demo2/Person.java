package state.demo2;

import state.demo1.Persion;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Person {

    //存储所有状态，用Map存储比较方便按名称存储和获取
    private Map<String, Mood> moods;
    //当前状态信息
    private Mood currentMood;

    public Person() {
        //初始化，设置默认状态
        moods = new HashMap<String, Mood>();
        moods.put("default", new DefaultMood());
    }

    public void action() throws IOException {
        //1.获取状态信息，有一个问题，并发频繁访问会影响性能 ，可以使用缓存技术，将状态量放进缓存
        //2.线程安全问题，currentMood可能会被改变，可取消currentMood作为成员变量，或用另一个临时引用currentMood_替代currentMood
        currentMood = moods.get(getProperties());
        //找不到指定状态，使用默认状态
        if (currentMood == null) {
            moods.get("default").action();
        }
        currentMood.action();
    }

    //传入状态，不用set方法直接传Map是为了不暴露Persion类内部的数据结构，也显得更直接
    public void addMoods(String moodName, Mood mood) {
        moods.put(moodName, mood);
    }

    private String getProperties() throws IOException {
        Properties properties = new Properties();
        properties.load(Persion.class.getResourceAsStream("mood.properties"));
        return properties.getProperty("mood");
    }
}
