

public class Game {
	User user1,user2;
	CommonModule com = new CommonModule();
	
	public Game(){
		String userName1, userName2;
		System.out.println("ù��° ������ �̸��� �Է��ϼ��� : ");
		userName1 = com.inputString();
		System.out.println("�ι�° ������ �̸��� �Է��ϼ��� : ");
		userName2 = com.inputString();
		
		user1 = new User(userName1);
		user2 = new User(userName2);
	}
	
	public void gaming(){
		boolean firstTurn = true;
		while(chkUserLive()){
			userTurn(user1, firstTurn);
			if(!chkUserLive())
				break;
			userTurn(user2, firstTurn);
			
			if(firstTurn) firstTurn = false;
		}
	}
	
	public void userTurn(User user, boolean firstYN){
		int menuNum = 1;
		if(!firstYN)
			user.getCard();
		while(menuNum == 2){
			menuNum = printMenu(user2);
			doAct(user2,user1,menuNum);				
		}
	}
	
	public void alertWinner(User winner){
		System.out.println(winner.getName() + "�� �¸�!!");
	}
	
	public boolean chkUserLive(){
		boolean liveYN = true;
		
		if(this.user1.getHp() <= 0){
			liveYN = false;
			alertWinner(this.user2);
		}else if(this.user2.getHp() <= 0){
			liveYN = false;
			alertWinner(this.user1);
		}
		
		return liveYN;
	}
	
	public int printMenu(User user){
		System.out.println("====������ �Ͻðڽ��ϱ�?====");
		System.out.println(user.getName() + "�� �����Դϴ�.");
		System.out.println("���� hp : " + user.getHp());
		System.out.println("1. ��밡���� ī�庸��");
		System.out.println("2. ���� ���� ����");
		System.out.println("3. ���� ī�� ����");
		System.out.println("0. �� �ѱ��");
		
		int menuNum = com.intpuNumber();
		return menuNum;
	}

	public void doAct(User user, User enemy, int selectedNum){
		switch(selectedNum){
		case 0:
			return;
		case 1:
			user.showMyCards();
			break;
		case 2:
			user.attackUser(enemy);
			break;
		case 3:
			user.attackCard(enemy);
			break;
		}
	}
	
	
}
