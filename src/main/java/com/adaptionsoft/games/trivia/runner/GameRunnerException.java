package com.adaptionsoft.games.trivia.runner;

public class GameRunnerException extends Exception {
	String message;

	public GameRunnerException(String message) {
		this.message = message;
	}
}
