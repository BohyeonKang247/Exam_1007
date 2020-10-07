package p1007;

public class Ex05_09 {

	public static void main(String[] args) {
		
		
		int mul=1;
		
		for(int i=1;i<11;i++){
			for(int j=1;j<=i;j++){
				
				System.out.printf("%d",j);
				if(i==j){
					System.out.printf("");
				}else{
					System.out.printf("*");
				}
				
				mul=mul*j;
				
			}
			System.out.printf("=%d",mul);
			System.out.print("\n");
			mul=1;
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
