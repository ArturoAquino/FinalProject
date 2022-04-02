import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		// Instantiate Deck
		Deck deck = new Deck();
		
		int player1Score = 0;
		int player2Score = 0;
		// Instantiate two players
		Player player1 = new Player(0, "Jon");
		Player player2 = new Player(0, "Jake");
		
		// Call the shuffle method
		deck.shuffle();
		
		for (int i = 0; i < 26; i++) {
			player1.drawCard(deck);
			player2.drawCard(deck);
		
		}
		// temp array list to hold players cards 
		ArrayList<Card> temp = new ArrayList<>();
		ArrayList<Card> temp2 = new ArrayList<>();
		
		// for loop to flip players hand and add to array list
		// and compares each player's card to see which has the highest 
		// value and increments the score of the player with the highest
		// valued card
		for(int i = 0; i < 26; i++) {
			temp.add(player1.flip());
			temp2.add(player2.flip());
			
			if(temp.get(i).getValue() < temp2.get(i).getValue()) {
				player2Score = player2.incrementScore();
			
			} else if(temp.get(i).getValue() > temp2.get(i).getValue()) {
				player1Score = player1.incrementScore();
			}
		}
		
		System.out.println("Player 1's score: " + player1Score);
		System.out.println("Player 2's score: " + player2Score);
	
		// If statment to determine who won 
		if (player1Score > player2Score) {
			System.out.println("Player 1 wins." );
		} else if (player1Score < player2Score) {
			System.out.println("Player 2 wins.");
		} else {
			System.out.println("Draw");
		}
		
		
		
		
	}

}
