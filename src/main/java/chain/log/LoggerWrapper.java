package chain.log;

import chain.log.Logger.Level;
import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
public class LoggerWrapper {

    @NonNull
    private Logger Logger;

    @NonNull
    private Level level;

    public void error(String msg) {
        this.handle(Level.ERROR, msg);
    }

    ;

    public void warn(String msg) {
        this.handle(Level.WARN, msg);
    }

    ;

    public void info(String msg) {
        this.handle(Level.INFO, msg);
    }

    ;

    public void debug(String msg) {
        this.handle(Level.DEBUG, msg);
    }

    ;

    private void handle(Level level, String msg) {
        if (this.level.compareTo(level) > -1) {
            Logger.handle(level, msg);
        }
    }
}
