package com.adaptionsoft.games.trivia;

import static org.junit.Assert.*;

import com.adaptionsoft.games.trivia.runner.GameRunner;
import com.adaptionsoft.games.trivia.runner.GameRunnerException;
import org.junit.Test;

public class GameRunnerTest {

	@Test
	public void game01Test() throws Exception {
		String[] players = new String[] {"Thuc", "Tu", "Viet"};
		String expectWinnerName = players[2];

		int[] rolls = new int[] {2, 1, 4, 2, 1, 2, 4, 5, 1, 3, 1, 4, 5, 5, 3, 2, 1, 5, 4, 3, 2, 5, 2, 2, 2, 5, 2, 2, 5, 3, 2, 3, 2, 4, 5, 5, 2, 4, 1, 1, 1, 2, 3, 2, 2, 1, 3, 5, 5, 3, 3, 2, 4, 2, 2, 2, 3, 5, 3, 5, 4, 3, 4, 4, 3, 2, 5, 3, 1, 2, 4, 1, 1, 1, 3, 2, 2, 1, 1, 5, 2, 1, 4, 4, 3, 2, 2, 5, 2, 2, 4, 1, 2, 1, 1, 3, 4, 1, 3, 2, 2, 1, 3, 1, 5, 5, 5, 1, 5, 3, 2, 4, 4, 3, 2, 4, 3, 3, 2, 1, 1, 3, 4, 1, 3, 3, 4, 5, 4, 3, 1, 5, 2, 3, 4, 5, 5, 1, 4, 5, 4, 2, 2, 3, 5, 1, 3, 3, 1, 1, 4, 5, 2, 4, 2, 5, 3, 4, 2, 5, 1, 4, 4, 5, 2, 4, 5, 4, 2, 4, 5, 1, 4, 1, 4, 3, 1, 3, 3, 2, 4, 1, 3, 2, 1, 3, 2, 1, 5};
		boolean[] ans = new boolean[] {false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, true};

		assertEquals(GameRunner.getWinner(players, rolls, ans), expectWinnerName);
	}

	@Test
	public void game02Test() throws Exception {
		String[] players = new String[] {"Thuc", "Tu", "Viet"};
		String expectWinnerName = players[0];

		int[] rolls = new int[] {4, 4, 5, 1, 3, 3, 2, 4, 5, 2, 3, 4, 2, 4, 2, 4, 5, 1, 4, 5, 3, 1, 3, 3, 2, 1, 2, 3, 4, 3, 3, 2, 3, 3, 4, 2, 5, 3, 1, 2, 2, 5, 1, 2, 2, 2, 5, 1, 3, 5, 4, 2, 4, 5, 1, 4, 3, 2, 1, 5, 2, 3, 4, 1, 5, 4, 1, 5, 2, 2, 4, 5, 3, 1, 3, 5, 5, 4, 4, 4, 2, 2, 1, 4, 4, 4, 2, 5, 4, 2, 3, 5, 3, 4, 2, 1, 1, 5, 5, 4, 4, 2, 3, 5, 4, 2, 2, 1, 3, 1, 4, 5, 5, 3, 2, 2, 1, 1};
		boolean[] ans = new boolean[] {true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, true, true, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, true};

		assertEquals(GameRunner.getWinner(players, rolls, ans), expectWinnerName);
	}

	@Test
	public void game03Test() throws Exception {
		String[] players = new String[] {"Thuc", "Tu", "Viet"};
		String expectWinnerName = players[1];

		int[] rolls = new int[] {3, 2, 3, 3, 1, 3, 5, 1, 1, 4, 3, 5, 3, 3, 4, 1, 2, 4, 3, 5, 5, 4, 5, 1, 5, 3, 1, 2, 2, 1, 3, 1, 2, 4, 3, 1, 5, 2, 2, 2, 3, 5, 1, 4, 2, 3, 4, 5, 1, 5, 2, 3, 2, 5, 1, 3, 2, 5, 4, 2, 4, 2, 1, 4, 4, 2, 3, 3, 1, 4, 4, 1, 1, 5, 4, 1, 5, 3, 5, 4, 5, 5, 1, 2, 2, 5, 1, 5, 2, 1, 4, 5, 2, 2, 3, 3, 2, 2, 5, 3, 5, 2, 5, 5, 4, 1, 4, 2, 5, 1, 3, 4, 5, 1, 5, 4, 4, 5, 1, 4, 3, 5, 4, 3, 5, 4, 3, 4, 3, 4, 4, 5, 5, 1, 5, 4, 3, 5, 5, 2, 1, 5, 4, 5, 2, 5, 5, 3, 1, 2, 2, 1, 5, 4, 5, 3, 3, 2, 3, 5, 2, 2, 3, 5, 2, 4, 2, 1, 4, 1};
		boolean[] ans = new boolean[] {false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, true, true, true, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, true, true, false, false, false, true, true, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, true, false, true, true, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true};

		assertEquals(GameRunner.getWinner(players, rolls, ans), expectWinnerName);
	}

	@Test(expected = GameRunnerException.class)
	public void tooManyPlayersGameTest() throws Exception {
		String[] players = new String[] {"Thuc", "Tu", "Viet", "Thuc xam tro", "Tu Xam Tro", "Viet Xam Tro", "Lan ngay tho"};

		int[] rolls = new int[] {3, 2, 3, 3, 1, 3, 5, 1, 1, 4, 3, 5, 3, 3, 4, 1, 2, 4, 3, 5, 5, 4, 5, 1, 5, 3, 1, 2, 2, 1, 3, 1, 2, 4, 3, 1, 5, 2, 2, 2, 3, 5, 1, 4, 2, 3, 4, 5, 1, 5, 2, 3, 2, 5, 1, 3, 2, 5, 4, 2, 4, 2, 1, 4, 4, 2, 3, 3, 1, 4, 4, 1, 1, 5, 4, 1, 5, 3, 5, 4, 5, 5, 1, 2, 2, 5, 1, 5, 2, 1, 4, 5, 2, 2, 3, 3, 2, 2, 5, 3, 5, 2, 5, 5, 4, 1, 4, 2, 5, 1, 3, 4, 5, 1, 5, 4, 4, 5, 1, 4, 3, 5, 4, 3, 5, 4, 3, 4, 3, 4, 4, 5, 5, 1, 5, 4, 3, 5, 5, 2, 1, 5, 4, 5, 2, 5, 5, 3, 1, 2, 2, 1, 5, 4, 5, 3, 3, 2, 3, 5, 2, 2, 3, 5, 2, 4, 2, 1, 4, 1};
		boolean[] ans = new boolean[] {false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, true, true, true, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, true, true, false, false, false, true, true, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, true, false, true, true, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true};
		GameRunner.getWinner(players, rolls, ans);

		// If code reachs this line, it means test failed!
		assertTrue(false);
	}

	// TODO: add more tests
}
