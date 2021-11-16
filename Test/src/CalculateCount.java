
public class CalculateCount {

	public static void main(String[] args) {
  
	String s = "111100001111101";
	
	int count =0;
	
	char[] c = s.toCharArray();
	int localCount =0;
	for (int i=0 ;i<c.length;i++) {
	
		
		if(c[i] == '1') {
			localCount++;
		}
		if(c[i] == '0') {
			if (count < localCount) {
				count = localCount;
			}
			localCount= 0;
		}
		
	}
	 
	System.out.println("MAx continous occures of 1s is:" +count);

	}

}
