package command;

import lombok.Builder;

@Builder
public class GameHandler {

    //每一个槽位对应一个操作
    private Button a;
    private Button s;
    private Button d;
    private Button f;

    public void pushA() {
        a.execute();
    }

    public void pushS() {
        s.execute();
    }

    public void pushD() {
        d.execute();
    }

    public void pushF() {
        f.execute();
    }
}
