package WarCardGameApp;

import WarCardGameModel.Card;
import WarCardGameModel.Deck;
import WarCardGameModel.Player;

public class App {
	public static void main(String[] args) {
		// Instantiates a  Deck and two Player objects
		Deck deck = new Deck(); 
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		// Shuffle the deck
		deck.shuffle();
		
		// Deal cards to players
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		
		// Play 26 rounds
		for (int i = 0; i < 26; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			System.out.println("Round " + (i + 1) + ":");
			System.out.println("Player 1's card: ");
			card1.describe();
			System.out.println("Player 2's card: ");
			card2.describe();
			
			if (card1.getValue() > card2.getValue()) {
				player1.incrementScore();
				System.out.println("Player 1 wins this round!");
			} else if (card2.getValue() > card1.getValue()) {
				player2.incrementScore();
				System.out.println("Player 2 wins this round!");
			} else {
				System.out.println("It's a tie! No points awarded.");
			}
			System.out.println();
		}
		
		// Determine the winner!
		
		System.out.println("Final Scores:");
		System.out.println("Player 1: " + player1.getScore());
		System.out.println("Player 2: " + player2.getScore());
		
		if(player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 wins the game!");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println("Player 2 wins the game!");
		} else {
			System.out.println("The game is a draw!");
		}
	}

}
