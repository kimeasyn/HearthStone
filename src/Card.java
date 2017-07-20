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
		System.out.println("��   �� : " + this.getName());
		System.out.println("���ݷ� : " + this.getAttPower());
		System.out.println("ü   �� : " + this.getHp());
		System.out.println("==================");		
	}
	
	public boolean getAttacked(Card card){
		boolean dieCard = false;
		int getAttPower = card.getAttPower();
		this.hp -= getAttPower;
		
		if(this.hp > 0){
			System.out.println(this.getName() + "�� " + getAttPower + "��ŭ ������ �޾Ҵ�.");
			System.out.println("����ü�� : " + this.getHp());
		}else{
			System.out.println(this.getName() + "�� " + getAttPower + "��ŭ ������ �޾Ҵ�.");
			System.out.println(this.getName() + "�� �׾���.");
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
		�����ΰ�,
		Ʈ��,
		���,
		�ذ�,
		����,
		�ü�,
		������,
		�屺,
		����,
		������,
		����,
		��ɲ�;
		
		public static CardNames getName(){
			Random ran = new Random();
			return values()[ran.nextInt(12)];
		}
	}	
	private enum CardModifier{
		�����,
		�����,
		�����ִ�,
		������,
		���ݴ���,
		�ൿ����,
		����,
		����,
		������,
		������,
		�ǹ���,
		����,
		����,
		�𵥵�;
		
		public static CardModifier getModi(){
			Random ran = new Random();
			return values()[ran.nextInt(14)];
		}
	}
}
