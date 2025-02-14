package cardgames;

public class RegularCard implements Card {
	// Suits and ranks could be enums, but then they are different types
	// in different kinds of cards. Making them strings unifies the 
	// implementation, and also introduces an ordering. 
	public static String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	public static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
			"Jack", "Queen", "King", "Ace"};
	private String suit;
	private String rank;
	
	
	public RegularCard(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	// implement toString:
}