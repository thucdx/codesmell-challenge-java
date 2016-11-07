package com.adaptionsoft.games.uglytrivia;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Random;

public class GameTest {

	/**
	 * Check if a Rock question can be created properly
	 */
	@Test
	public void createRockQuestionTest() {
		Game game = new Game();
		Random rand = new Random();
		assertTrue(!game.createRockQuestion(rand.nextInt()).isEmpty());
	}

	/**
	 * Check if Game can add new player
	 */
	@Test
	public void addSinglePlayerTest() {
		Game game = new Game();
		int currentPlayer = game.howManyPlayers();
		assertTrue(currentPlayer == 0);
		boolean result = game.add("thucdx");

		assertTrue(result);
		assertEquals(game.howManyPlayers(), currentPlayer + 1);
	}

	/**
	 * Check if Game can add many players
	 */
	@Test
	public void addMultiplePlayersTest() {
		Game game = new Game();
		int totalPlayer = 3;

		for (int i = 0; i < totalPlayer; ++i) {
			game.add("Player number #" + i);
		}

		assertEquals(game.howManyPlayers(), totalPlayer);
	}

	/**
	 * Check if a game is limited to only small number of player (usually 6)
	 * Expect an Exception
	 */
	@Test(expected = Exception.class)
	public void addTooManyPlayersTest() {
		Game game = new Game();
		int manyPlayers = (int) 1e6;
		for (int i = 0; i < manyPlayers; ++i) {
			game.add("Player number #" + i);
		}

		// If code could go to this line, it means test failed!
		assertTrue(false);
	}

	/**
	 * If game has not started yet, then winner name remains unknown
	 */
	@Test
	public void getWinnerTest() {
		Game aGame = new Game();
		assertNull(aGame.getWinnerName());
	}
}
