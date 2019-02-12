package aop.simple;

public class testAop {

	public static void main(String[] args) {
		Coder coder = (Coder) new AopBuilder(new Coder()).build();
		coder.code();
		System.out.println("----------");
		
		Singer singer = (Singer) new AopBuilder(new Singer()).build();
		singer.sing();
		System.out.println("----------");
		
		Worker worker = (Worker) new AopBuilder(new Worker()).build();
		worker.work();
		System.out.println("----------");
	}
}
