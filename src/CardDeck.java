import java.util.*;

public class CardDeck {
	private Stack<Card> cards = new Stack<Card>();
	private static final int CARD_AMT = 30;
	
	public CardDeck(){
		for(int i = 0; i < CARD_AMT; i++){
			Card card = new Card();
			cards.push(card);
		}
		Collections.shuffle(cards);
	}
	
	public Card popCard(){
		return cards.pop();
	}
}
