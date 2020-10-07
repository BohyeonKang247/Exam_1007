package p1007;

import java.util.Scanner;

public class SuccessOrFail01 {

	public static void main(String[] args) {

			Scanner s=new Scanner(System.in);
			
			int score;
			
			System.out.print("점수를 입력하시오:");
			
			score =s.nextInt();
			
			if(score>=80){
				System.out.println("축하합니다! 합격입니다.");
			}else{
				System.out.println("불합격입니다.");
			}
		
				

	}

}
