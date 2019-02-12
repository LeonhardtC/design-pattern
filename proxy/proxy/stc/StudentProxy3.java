package proxy.stc;

public class StudentProxy3 implements Person {
	
	@SuppressWarnings("unused")
	private Student student;
	
	public StudentProxy3(Student student) {
		super();
		this.student = student;
	}
	
	@Override
	public void say() {
		//环绕处理
		System.out.println("我是一名学生");
	}

}
