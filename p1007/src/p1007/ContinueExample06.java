package p1007;

import java.util.Scanner;

public class ContinueExample06 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int number;
		
		int count=0,sum=0;
		Double avg = 0.0;
		
		System.out.print("정수 10개를 입력하세요.\n");
		
		
		for(int i=0;i<10;i++){
			
			number =s.nextInt();
			
			if(number<=0){
				
				continue;
				}
			count++;	
			sum+=number;
			}
		
		System.out.printf("양수의 합은 %d\n",sum);
			
					
			
	}
}
