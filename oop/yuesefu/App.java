package yuesefu;

/* 约瑟夫问题
 * 描述：从某个人开始报数，到指定数目退出游戏。
 * 问题：找出退出游戏顺序和最终幸存人。
 */
public class App {
	public static void main(String[] args) {
		Game game = new Game();
		game.init();
		game.run();
	}
}
