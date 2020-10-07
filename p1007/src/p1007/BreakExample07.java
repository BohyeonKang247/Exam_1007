package p1007;

import java.util.Scanner;

public class BreakExample07 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		String keep;
		
		
		System.out.println("exit을 입력하면 종료합니다.");
		
		
		int i=0;
		while(i<10){
			System.out.print(">>");
			keep=s.nextLine();
			
			if(keep.equals("exit")){
				
			System.out.println("종료합니다...");
				break;
				}
							
			}
		
		
			
	}
}
