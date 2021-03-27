package proxy.stc;

public class StudentProxy2 implements Person {

    private Student student;

    public StudentProxy2(Student student) {
        super();
        this.student = student;
    }

    @Override
    public void say() {
        //异常处理
        try {
            student.say();
        } catch (Exception e) {
            System.out.println("error:" + e.getMessage());
        }
    }

}
