package edu.miamioh.acm.highscore;

public class HighScore {
	private int id;
	private int score;
	private Game game;
	private Player player;

	/**
	 * Construct a new HighScore object with the given ID number, score,
	 * related Player and related Game.
	 *
	 * @param id The ID number for this HighScore object
	 * @param score The numeric score for this HighScore object
	 * @param g The Game object that this HighScore belongs to
	 * @param p The Player object that this HighScore belongs to
	 */
	private HighScore(int id, int score, Game g, Player p) {
		this.id = id;
		this.score = score;
		this.game = g;
		this.player = p;
	}
}