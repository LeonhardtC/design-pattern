package executor;

public class testDelegate {

	public static void main(String[] args) {
		new Dispatcher(new ExecutorA()).execute();
	}
}
