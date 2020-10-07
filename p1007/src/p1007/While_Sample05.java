package p1007;

import java.util.Scanner;

public class While_Sample05 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int number;
		int i=0;
		
		int count=0,sum=0;
		Double avg = 0.0;
		
		System.out.print("정수를 입력하고 마지막에 -1을 입력하세요.\n");
		
		
		do{
			i++;
			number =s.nextInt();
			
			if(number==-1){
				
				break;
				}
			count++;	
			sum+=number;
			}while(i>=0);
		
		avg=(double)sum/count;
		System.out.printf("정수의 개수는 %d개이며 합은 %d이고 평균은 %.2f이다\n", count,sum,avg);
			
					
			
	}
}
