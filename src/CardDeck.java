import java.util.Stack;

public class CardDeck {
	
	private Stack<Card> cardDeck;
	
	public void popCard(){
		cardDeck.pop();
	}
	
	public void pushCard(Card card){
		if(cardDeck.size() < 30){
			cardDeck.push(card);
		}		
	}
}
