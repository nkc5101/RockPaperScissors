package com.rps.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class Game {
	private UUID id;
	private User player1;
	private User player2;
	private int playerOneWins;
	private int playerTwoWins;
	private boolean isOpen;
	
	public Game(User player1) {
		this.id = UUID.randomUUID();
		this.player1 = player1;
		this.player2 = null;
		this.playerOneWins = 0;
		this.playerTwoWins = 0;
		this.isOpen = true;
	}

	public User getPlayer1() {
		return player1;
	}

	public void setPlayer1(User player1) {
		this.player1 = player1;
	}

	public User getPlayer2() {
		return player2;
	}

	public void setPlayer2(User player2) {
		this.player2 = player2;
	}
	
	public UUID getId() {
		return id;
	}
	
	public void setIsOpen(boolean isOpen) {
		this.isOpen=isOpen;
	}
	
	public boolean getIsOpen() {
		return isOpen;
	}
	@JsonIgnore
	public int getWinner() {
		//playerOne win = 1
		//playerTwo win = 0
		//tie = -1
		if(player1.getMove().equals("paper")) {
			if(player2.getMove().equals("rock")) {
				playerOneWins += 1;
				return 1;
			} else if(player2.getMove().equals("scissors")) {
				playerTwoWins += 1;
				return 0;
			} else {
				return -1;
			}
		} else if(player1.getMove().equals("rock")){
			if(player2.getMove().equals("paper")) {
				playerTwoWins += 1;
				return 0;
			} else if(player2.getMove().equals("scissors")) {
				playerOneWins += 1;
				return 1;
			} else {
				return -1;
			}
		} else {
			if(player2.getMove().equals("rock")) {
				playerTwoWins += 1;
				return 0;
			} else if(player2.getMove().equals("paper")) {
				playerOneWins += 1;
				return 1;
			} else {
				return -1;
			}
		}
	}
}
