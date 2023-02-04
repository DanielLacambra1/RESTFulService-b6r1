package com.ej.b6r1.bean;

public class Greeting {

	private String player;
    private String message;
 
    public Greeting(String player, String message) {
        this.setPlayer(player);
        this.setMessage(message);
    }

	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
