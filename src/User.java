import java.util.List;

public class User {
	
	private String name;
	private List<Hero> heroList;
	private int currentHP;
	private int maxMP;
	private int currentMP;
	
	public void getTurn(){
		this.maxMP++;
		this.currentMP = this.maxMP;
	}
	
	public void showCardInfo(Card selectedCard){
		System.out.println(" �̸� : " + selectedCard.getName());
		System.out.println(" ���� : " + selectedCard.getForUseMP());
		System.out.println("���ݷ� : " + selectedCard.getAttPower());
		System.out.println("����� : " + selectedCard.getCurrentHP());
	}
	
	public void useCard(Card myCard, Card targetCard){
		if(checkMP(myCard)){
			myCard.useCard(targetCard);
		}
	}
	
	public boolean checkMP(Card myCard){
		boolean usable = false;
		
		if(this.currentMP >= myCard.getForUseMP()){
			this.currentMP -= myCard.getForUseMP();
			usable = true;
		}
		
		return usable;
	}
	
}
