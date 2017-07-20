
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
		System.out.println(this.getName() + "�� ī�� ���");
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
		System.out.println("���ݿ� ����� ī���� ��ȣ�� �����ϼ��� : ");
		int cardNum = com.intpuNumber();
		Card card = myCards.selectCard(cardNum);
		
		enemy.getAttacked(card.getAttPower());
	}
	
	public void attackCard(User enemy){
		myCards.showCardList();
		System.out.println("���ݿ� ����� ī���� ��ȣ�� �����ϼ��� : ");
		int useCardNum = com.intpuNumber();
		Card attackingCard = myCards.selectCard(useCardNum);
		
		enemy.showMyCards();
		System.out.println("������ ���ī���� ��ȣ�� �����ϼ��� : ");
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
