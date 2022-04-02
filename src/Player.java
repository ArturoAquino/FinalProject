import java.util.ArrayList;

public class Player {
	
	private ArrayList<Card> hand;
	private int score;
	private String name;
	
	public Player(int score, String name) {
		this.score = 0;
		this.name = name;
		hand = new ArrayList<>();
	}
	
	public void describePlayer() {
		System.out.println("Player's name: " + name);
		System.out.println("PLayer's score: " + score);
		
		// call the describe method for each card in hand list
		for (int i = 0; i < hand.size(); i++) {
			System.out.println("Card info: " + hand.get(i).toString());
		}
	}
	
	
	// Method to flip top card from player's hand
	// flip method is the problem
	public Card flip() {
		hand.add(hand.remove(0));
		return hand.get(25);
		
	}
	
	// method to flip top card from player's hand
	public void drawCard(Deck deck) {
		// using draw method from deck class
		hand.add(deck.draw());
	}
	
	
	// Method to increment score when called on
	public int incrementScore() {
		score = score + 1;
		return score;
	}
	
}
