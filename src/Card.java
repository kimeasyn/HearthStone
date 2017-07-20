import java.util.Random;

public class Card {
	private String name;
	private int hp;
	private int attPower;
	
	public Card(){
		this.name = CardModifier.getModi() + " " + CardNames.getName();
		this.hp = (int)(Math.random() * 10) + 1;
		this.attPower = (int)(Math.random() * 10) + 1;
	}
	
	public void printCardInfo(){
		System.out.println("이   름 : " + this.getName());
		System.out.println("공격력 : " + this.getAttPower());
		System.out.println("체   력 : " + this.getHp());
		System.out.println("==================");		
	}
	
	public boolean getAttacked(Card card){
		boolean dieCard = false;
		int getAttPower = card.getAttPower();
		this.hp -= getAttPower;
		
		if(this.hp > 0){
			System.out.println(this.getName() + "이 " + getAttPower + "만큼 공격을 받았다.");
			System.out.println("남은체력 : " + this.getHp());
		}else{
			System.out.println(this.getName() + "이 " + getAttPower + "만큼 공격을 받았다.");
			System.out.println(this.getName() + "이 죽었다.");
			dieCard = true;
		}
		return dieCard;
	}
	
/*==============================================
System Area=====================================
==============================================*/

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getAttPower() {
		return attPower;
	}

	private enum CardNames{
		늑대인간,
		트롤,
		고블린,
		해골,
		전사,
		궁수,
		마법사,
		장군,
		병사,
		정찰병,
		요정,
		사냥꾼;
		
		public static CardNames getName(){
			Random ran = new Random();
			return values()[ran.nextInt(12)];
		}
	}	
	private enum CardModifier{
		고대의,
		어둠의,
		숨어있는,
		늪지의,
		돌격대장,
		행동대장,
		졸개,
		강한,
		숲속의,
		빛나는,
		의문의,
		신의,
		왕족,
		언데드;
		
		public static CardModifier getModi(){
			Random ran = new Random();
			return values()[ran.nextInt(14)];
		}
	}
}
