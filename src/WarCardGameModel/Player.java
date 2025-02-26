package WarCardGameModel;

import java.util.ArrayList;
import java.util.List;
		// Will represent a player in the game.
public class Player {
	private List<Card> hand = new ArrayList<>();
	private int score;
	private String name; 
	
	// Constructor 
	
	public Player(String name) {
		//describes the players name
		this.name = name;
		//tracks the players score
		this.score = 0;
	}
	
	// Describe method will print the players name, score, and cards in their hand.
	public void describe() {
		System.out.println("Player:" + name + ", Score: " + score);
		for (Card card : hand) {
			card.describe();
		}
	}
	
	// Flip method removes and returns the top card from the players hand
	public Card flip() {
		return hand.remove(0);
	}
	
	// Draw method draws a card from the deck and adds it to the players hand
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	// Increment score method increases the players score by 1
	public void incrementScore() {
		score++;
	}
	
	// Getter for score
	public int getScore() {
		return score; 
	}

}
