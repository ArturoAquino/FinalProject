import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> cards;
	private String[] card = {"Hearts", "Spades", "Diamonds", "Clubs"};
	private int[] value = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
	
	// Deck constructor 
	public Deck() { 
		
		// Instantiate the array list
		cards = new ArrayList<>();
		
		// For loop to add cards to array list
		for (int i = 0; i < card.length; i++) {
			for (int j = 0; j < value.length; j++) {
				cards.add(new Card(card[i], value[j]));
			}
		}
		
	}
	
	// Method that shuffles the deck
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	// Method that removes and returns the top of the cards field
	public Card draw() {
		cards.add(cards.remove(0));
		return (cards.get(51));
	}
	
}
