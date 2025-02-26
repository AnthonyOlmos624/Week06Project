package WarCardGameModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
		//this is going to represent a deck of 52 cards
public class Deck {
		// cards is going to be a list of Card objects
	private List<Card> cards = new ArrayList<>(); 
	
	//Constructor is going to populate the deck with 52 standard cards.
	public Deck() {
		String [] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String [] names = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		
		for (String suit : suits) {
			for (int i = 0; i < names.length; i++) {
				String cardName = names[i] + " of " + suit;
				Card card = new Card(i + 2, cardName); //Values 2-14
				cards.add(card);
			}
		}
	}
	
	// Shuffle method is to randomize the order of the cards
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	// Draw method is going to remove and return the top card from the deck.
	public Card draw() {
		return cards.remove(0); 
	}

}
