
public class SwapTwoNoWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 10;
		int  n2 = 11;
		
		System.out.println("Before swapping - n1:"+ n1+" ,n2:"+n2);
		
	    n1 = n1+ n2;
	    n2 = n1-n2;
	    n1 = n1 -n2;
		
		
		System.out.println("After swapping -n1:"+ n1+" ,n2 "+n2);
		
		String i = "1";
		String j = "2";
		
		if (i== j) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}

}
