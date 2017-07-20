import java.util.*;

public class MyCards {
	
	private List<Card> cards = new ArrayList<Card>();
	
	public CardDeck DrawCard(CardDeck deck){
		cards.add(deck.popCard());
		
		return deck;
	}
	
	public void showCardList(){
		System.out.println("======보유카드======");
		
		for(int i = 0; i < this.cards.size(); i++){
			System.out.println("번   호 : " + i);
			this.cards.get(i).printCardInfo();
		}
	}
	
	public void getAttackedMyCard(int index, Card attackingCard){
		Card targetCard = cards.get(index);
		
		if(targetCard.getAttacked(attackingCard))
			cards.remove(index);		
	}
	
	public Card selectCard(int index){
		Card selectedCard = cards.get(index); 
		cards.remove(index);
		
		return selectedCard;
	}
	
	public void removeCard(int index){
		this.cards.remove(index);
	}
	
}
