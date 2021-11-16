
public class Hello {

	public static void main(String[] args) {
		
		/*
		 * for (int i=1 ;i<=5;i++) { for(int j=1;j<=i;j++) { System.out.print("*"); }
		 * System.out.println(); }
		 * 
		 */
		
		int num = 1234;
		int sumOFDigits = 0 ;
		
		while(true) {
			sumOFDigits = sumOFDigits+ num%10;
		    num = num/10;
			if(num<10) {
				break;
			}
		}
		sumOFDigits = sumOFDigits + num;
		
		System.out.println("sum is "+ sumOFDigits);
	}

}
