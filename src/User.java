
public class User {
	private String name;
	private MyCards myCards;
	private CardDeck deck;
	private int hp;
	private static final int START_HP = 20;
	CommonModule com = new CommonModule();
	
	public User(String name){
		this.name = name;
		this.deck = new CardDeck();
		this.myCards = new MyCards();
		this.hp = START_HP;
		
		for(int i = 0; i < 3; i++){
			this.deck = myCards.DrawCard(deck);
		}
		System.out.println(this.getName() + "의 카드 목록");
		myCards.showCardList();
		System.out.println("==================");
	}

	public void showMyCards(){
		myCards.showCardList();
	}
	
	public void getCard(){
		this.deck = myCards.DrawCard(deck);
	}
	
	public void attackUser(User enemy){
		myCards.showCardList();
		System.out.println("공격에 사용할 카드의 번호를 선택하세요 : ");
		int cardNum = com.intpuNumber();
		Card card = myCards.selectCard(cardNum);
		
		enemy.getAttacked(card.getAttPower());
	}
	
	public void attackCard(User enemy){
		myCards.showCardList();
		System.out.println("공격에 사용할 카드의 번호를 선택하세요 : ");
		int useCardNum = com.intpuNumber();
		Card attackingCard = myCards.selectCard(useCardNum);
		
		enemy.showMyCards();
		System.out.println("공격할 대상카드의 번호를 선택하세요 : ");
		int targetNum = com.intpuNumber();
		enemy.getAttackedMyCard(targetNum, attackingCard);
	}
	
	public void getAttackedMyCard(int index, Card attackingCard){
		myCards.getAttackedMyCard(index, attackingCard);
	}
	
	public void getAttacked(int attPower){
		this.hp -= attPower;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getHp(){
		return this.hp;
	}
	
}
