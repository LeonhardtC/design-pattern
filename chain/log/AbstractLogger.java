package log;

import lombok.Data;
import lombok.NonNull;

@Data
public abstract class AbstractLogger implements Logger {
	
	@NonNull
	private Level level;

	private Logger nextLogger;
	
	@Override
	public void handle(Level level, String msg) {
		if (this.level.compareTo(level) == 0) {
			doHandle(level, msg);
		} else if (hasNext()) {
			getNextLogger().handle(level, msg);
		}
	}
	
	abstract protected void doHandle(Level level, String msg);
	
	private boolean hasNext() {
		return this.nextLogger != null;
	}
}
