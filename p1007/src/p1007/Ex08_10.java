package p1007;

public class Ex08_10 {

	public static void main(String[] args) {
		
		int i;
		int total=0 ,count=0;
		
		
		System.out.println("1부터 n까지의 합 중에서 5000을 넘지 않는 가장 큰 합은?");
		for(i=0;i<150;i++){
			
			total+=i;
			if(total>=5000){
				break;
				}
			
			count++;
			}
		
			total=total-i;
		
			System.out.printf("1부터%d까지의 합이 %d 입니다.\n",count-1,total);
			System.out.print("\n");
			
		}
		
		
		
		

	}