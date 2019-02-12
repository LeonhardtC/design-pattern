package log;

public class WarnLogger extends AbstractLogger {

	public WarnLogger() {
		super(Level.WARN);
	}

	@Override
	protected void doHandle(Level level, String msg) {
		System.out.println("warn:"+msg);
	}

}
