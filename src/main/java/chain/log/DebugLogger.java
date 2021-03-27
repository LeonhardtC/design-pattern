package chain.log;

public class DebugLogger extends AbstractLogger {

    public DebugLogger() {
        super(Level.DEBUG);
    }

    @Override
    protected void doHandle(Level level, String msg) {
        System.out.println("debug:" + msg);
    }

}
