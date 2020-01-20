package model;

public class User {
	private String username;
	private String password;
	private String move;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getMove() {
		return move;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setMove(String move) {
		this.move = move;
	}
}
