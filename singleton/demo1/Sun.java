package demo1;

public class Sun {
	//对象成员和对象方法，只有创建对象才有，才能使用。
	private int tem;
	private int size;
	
	//创建类成员和类方法
	private static Sun sun = new Sun();
	
	public static Sun getUniqueInstance(){
		return sun;
	}
	
	//通过私有化构造方法阻止创建多个对象
	private Sun(){};
	
	public int getTem() {
		return tem;
	}
	public void setTem(int tem) {
		this.tem = tem;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void shine(){
		System.out.println("发出光芒，普照大地");
	}
	
}
