package proxy.stc;

public class testStudentProxy {

    public static void main(String[] args) {
        Student student = new Student();
        new StudentProxy1(student).say();
        new StudentProxy2(student).say();
        new StudentProxy3(student).say();
    }
}
