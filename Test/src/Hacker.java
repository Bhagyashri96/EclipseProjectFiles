import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hacker {

		public static void main(String[] args) throws IOException {
			/*
			 * BufferedReader bufferedReader = new BufferedReader(new
			 * InputStreamReader(System.in));
			 * 
			 * int n = Integer.parseInt(bufferedReader.readLine().trim());
			 */

	        fizzBuzz(15);

	       // bufferedReader.close();
	    }
	
	

		
    public static void fizzBuzz(int n) {
    for(int i=1; i<=n ;i++){
      
      int result =  i%3;
      int result1 = i%5;
       
       if (result == 0 && result1 == 0) {
           System.out.println("FizzBuzz");
       }else if(result == 0) {
           System.out.println("Fizz");
       }else if(result1 == 0){
           System.out.println("Buzz");
       }else{
           System.out.println(i);
       }
  
      }
    }

}


