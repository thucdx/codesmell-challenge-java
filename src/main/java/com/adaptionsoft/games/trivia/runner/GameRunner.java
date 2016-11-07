
package com.adaptionsoft.games.trivia.runner;
import java.util.ArrayList;
import java.util.Random;

import com.adaptionsoft.games.uglytrivia.Game;


public class GameRunner {

	private static boolean notAWinner;

	/**
	 * Game stimulation
	 * @param players 2 <= players <= 6
	 * @param rolls 1 <= rolls.length, 1 <= rolls[i] <= 5
	 * @param answers 1 <= answers.length; answers.length == rolls.length
	 * @return winner name
	 */
	public static String getWinner(String[] players, int[] rolls, boolean[] answers) throws GameRunnerException {
		boolean notYetWinner;

		// Validate
		int totalPlayer = players.length;
		if (totalPlayer <= 1 || totalPlayer > 6) {
			throw new GameRunnerException("Invalid game! Number of players must be in range [2,6]");
		}

		int totalRoll = rolls.length, totalAnswer = answers.length;
		if (totalRoll < 1 || totalRoll != totalAnswer) {
			throw new GameRunnerException("Number of rolls and answer must be equal! And must not be zero");
		}

		// Init game
		Game aGame = new Game();

		for (String player: players) {
			aGame.add(player);
		}

		int id = 0;
		do {
			aGame.roll(rolls[id]);

			if (!answers[id]) {
				notYetWinner = aGame.wrongAnswer();
			} else {
				notYetWinner = aGame.wasCorrectlyAnswered();
			}
		} while (++id < totalRoll && notYetWinner);

		return aGame.getWinnerName();
	}

	public static void main(String[] args) {
		Game aGame = new Game();
		
		aGame.add("Chet");
		aGame.add("Pat");
		aGame.add("Sue");
		
		Random rand = new Random();

		ArrayList<Integer> rolls = new ArrayList<Integer>();
		ArrayList<Boolean> ans = new ArrayList<Boolean>();

		do {

			int cur = rand.nextInt(5) + 1;
			rolls.add(cur);
			aGame.roll(cur);
			boolean isCorrect = rand.nextInt(9) == 7;
			ans.add(isCorrect);

			if (!isCorrect) {
				notAWinner = aGame.wrongAnswer();
			} else {
				notAWinner = aGame.wasCorrectlyAnswered();
			}
			
			
			
		} while (notAWinner);

		System.out.println("Winner's Name: " + aGame.getWinnerName());
	}
}
