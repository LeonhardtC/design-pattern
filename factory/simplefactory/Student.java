package simplefactory;

public abstract class Student {
	
	public static Student getInstance(){
		return new CollegeStudent();
	}
	
	public abstract void say();
	
	@SuppressWarnings("unused")
	private static class PrimaryStudent extends Student{
		@Override
		public void say() {
			System.out.println("我是小学生");
		}
	}

	private static class CollegeStudent extends Student{
		@Override
		public void say() {
			System.out.println("我是大学生");
		}
	}
}
