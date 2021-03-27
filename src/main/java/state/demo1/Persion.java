package state.demo1;

public class Persion {
    private Mood mood;

    public void action() {
        mood.action();
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }
}
