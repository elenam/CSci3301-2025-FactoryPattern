package cardgames;

public class RegularCard implements Card {
	public static enum Suit {CLUBS, SPADES, HEARTS, DIAMONDS};;
	public static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
			"Jack", "Queen", "King", "Ace"};
	private Suit suit;
	private String rank;
	
	
	public RegularCard(Suit suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	// implement toString:
}