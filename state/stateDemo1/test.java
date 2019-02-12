package stateDemo1;

public class test {
	public static void main(String[] args) {
		Persion persion = new Persion();
		Mood mood = new HappyMood();
		persion.setMood(mood);
		persion.action();
	}
}
