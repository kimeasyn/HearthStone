

public class Game {
	User user1,user2;
	CommonModule com = new CommonModule();
	
	public Game(){
		String userName1, userName2;
		System.out.println("첫번째 유저의 이름을 입력하세요 : ");
		userName1 = com.inputString();
		System.out.println("두번째 유저의 이름을 입력하세요 : ");
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
		System.out.println(winner.getName() + "의 승리!!");
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
		System.out.println("====무엇을 하시겠습니까?====");
		System.out.println(user.getName() + "의 차례입니다.");
		System.out.println("현재 hp : " + user.getHp());
		System.out.println("1. 사용가능한 카드보기");
		System.out.println("2. 상대방 유저 공격");
		System.out.println("3. 상대방 카드 공격");
		System.out.println("0. 턴 넘기기");
		
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
