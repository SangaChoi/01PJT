

public class List {

	public static void main(String[] args) {
		
		int k=1;
		
		while(k<=17) {
		
			System.out.println("k : "+k);
			
			for(int i=k; i<=17; i++) {
				
				k+=5;
				
				System.out.print("i : "+i);
				if(i%5==0) {
					System.out.println("*");
					continue;
				}
			}
		}

	}

}
