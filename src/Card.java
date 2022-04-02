
public class Card {

	private int value;
	private String name;
	
	
	
	public Card(String name, int value) {
		// TODO Auto-generated constructor stub
		this.value = value;
		this.name = name;
	}
	
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// Method that prints out info of the card
	public String toString() {
		return value + " of " + name;
	}
	
	
}
