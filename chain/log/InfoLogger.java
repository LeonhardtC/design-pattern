package log;

public class InfoLogger extends AbstractLogger {

	public InfoLogger() {
		super(Level.INFO);
	}
	
	@Override
	protected void doHandle(Level level, String msg) {
		System.out.println("info:"+msg);
	}

}
