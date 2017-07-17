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
		System.out.println(" 이름 : " + selectedCard.getName());
		System.out.println(" 마나 : " + selectedCard.getForUseMP());
		System.out.println("공격력 : " + selectedCard.getAttPower());
		System.out.println("생명력 : " + selectedCard.getCurrentHP());
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
