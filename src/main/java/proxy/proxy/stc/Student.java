package proxy.stc;

import java.util.Objects;

public class Student implements Person {

    private String name;

    public Student() {
    }

    public Student(String name) {
        super();
        this.name = name;
    }

    @Override
    public void say() {
        if (Objects.isNull(name)) {
            throw new RuntimeException("无名氏");
        }
        System.out.println("我是一名学生");
    }

}
