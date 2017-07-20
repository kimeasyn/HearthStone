import java.util.Scanner;

public class CommonModule {
	Scanner scan = new Scanner(System.in);
	
	public int intpuNumber(){
		int num = scan.nextInt();
		return num;
	}
	
	public String inputString(){
		String str = scan.nextLine();
		return str;
	}
}
