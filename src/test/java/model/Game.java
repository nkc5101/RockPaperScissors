package model;

import java.util.UUID;

public class Game {
	private User player1;
	private User player2;
	private UUID id;
	private int playerOneWins;
	private int playerTwoWins;
	
	public Game(UUID id) {
		this.id = id;
		this.playerOneWins = 0;
		this.playerTwoWins = 0;
	}

	public User getPlayer1() {
		return player1;
	}

	public User getPlayer2() {
		return player2;
	}

	public void setPlayer1(User player1) {
		this.player1 = player1;
	}

	public void setPlayer2(User player2) {
		this.player2 = player2;
	}
	
	
}
