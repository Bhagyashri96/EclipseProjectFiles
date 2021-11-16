
public class product {

	public static void main(String[] args) {
		 int [] A = {0,-100,};
	        int result ;
	        int Product = A[0] ;
	        for(int i=0 ; i<A.length ;i++) {
            if(i == 0) {
         	   Product = A[i];
            }else {
         	   Product = Product * A[i];
            }
	        }
	        
	        if (Product < 0) {
	        	System.out.println("-1");
	        }else if(Product == 0) {
	        	System.out.println("0");
	        }else {
	        	System.out.println("1");
	        }
	        
	}

}
