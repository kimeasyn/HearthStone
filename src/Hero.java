
public class Hero {
	private CardDeck myCardDeck;
	private boolean healORatt;
	private int skillPower;
	
	public Hero(CardDeck deck, boolean healORatt, int skillPower){
		this.myCardDeck = deck;
		this.healORatt = healORatt;	//True = Healing Skill, False = Damage dealing Skill
		this.skillPower = skillPower;
	}
	
	public void setCurrentHP(int attPower){
		this.currentHP += attPower;
	}
	
	public void useSkill(Card targetCard){
		if(healORatt){
			targetCard.setCurrentHP(this.skillPower);
		}
		else{
			targetCard.setCurrentHP(this.skillPower * -1);
		}
			
	}
	public void useSkill(Hero targetHero){
		if(healORatt){
			targetHero.setCurrentHP(this.skillPower);
		}
		else{
			targetHero.setCurrentHP(this.skillPower * -1);
		}
	}
}
