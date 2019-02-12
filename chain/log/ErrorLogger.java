package log;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger() {
		super(Level.ERROR);
	}

	@Override
	protected void doHandle(Level level, String msg) {
		System.out.println("error:"+msg);
	}

}
