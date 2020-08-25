
class Game {

	private static int highestScore;
	private static String bestPlayer;
	private String playerName;
	private int score;

	public Game(String playerName, int score) {
		this.playerName = playerName;
		this.score = score;
	}

	public void checkHighestScore() {

		if (this.score > Game.highestScore) {
			Game.highestScore = this.score;
			Game.bestPlayer = this.playerName;
		}
	}

	public static void displayHighestScore() {
		System.out.println("player name" + Game.bestPlayer);
		System.out.println("hish score" + Game.highestScore);
	}

}

public class Demo {
	public static void main(String... s) {
		Game game1 = new Game("sham", 600);
		Game game2 = new Game("razor", 500);
		Game.displayHighestScore();
		game2.checkHighestScore();
		Game.displayHighestScore();
	}
}
