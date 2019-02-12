package log;

public interface Logger {

	void handle(Level level, String msg);
	
	public enum Level {
		ERROR,WARN,INFO,DEBUG
	}
}
