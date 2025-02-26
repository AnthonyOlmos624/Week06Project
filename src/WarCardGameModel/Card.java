package WarCardGameModel;
		// This class represents a single playing card.
public class Card {
	private int value;
	private String name;
	
	//Constructor
	public Card(int value, String name) {
		// value is the numeric value of the card 2-14
		this.value = value;
		// name is for the name of the cards ex. "Ace of Spades."
		this.name = name;
	}
	
	//Getters and Setters
	public int getValue() { return value; }
	public void setValue(int value) { this.value = value; }
	public String getName() { return name; }
	public void setName (String name) { this.name = name; }
	
	//Describe method prints the card's name and value
	public void describe() {
		System.out.println(name + ", Value: " + value);
	}

}
