
public class Card {
	private String name;
	private int forUseMP;
	private int attPower;
	private int currentHP;
	
	public Card(String name, int forUseMP, int attPower, int currentHP){
		this.name = name;
		this.forUseMP = forUseMP;
		this.attPower = attPower;
		this.currentHP = currentHP;
	}
		
	public void useCard(Card targetCard){
		this.setCurrentHP(targetCard.currentHP);
		targetCard.setCurrentHP(this.attPower);
	}
	
	public void setCurrentHP(int attPower){
		this.currentHP -= attPower;
	}

	public String getName() {
		return name;
	}

	public int getForUseMP() {
		return forUseMP;
	}

	public int getAttPower() {
		return attPower;
	}

	public int getCurrentHP() {
		return currentHP;
	}
}
