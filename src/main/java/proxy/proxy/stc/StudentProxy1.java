package proxy.stc;

public class StudentProxy1 implements Person {

    private Student student;

    public StudentProxy1(Student student) {
        super();
        this.student = student;
    }

    @Override
    public void say() {
        //前后置处理
        System.out.println("共产主义接班人");
        student.say();
        System.out.println("向毛主席致敬");
    }

}
