package demo1;

public class testGameHandler {

	public static void main(String[] args) {
		GameHandler handler = GameHandler.builder()
			.a(new LeftButton())
			.s(new UpButton())
			.d(new DownButton())
			.f(new RightButton())
			.build();
		handler.pushA();
		handler.pushS();
		handler.pushD();
		handler.pushF();
	}
}
