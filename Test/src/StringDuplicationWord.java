import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringDuplicationWord {

	public static void main(String[] args) {

     //String str = "I love Mumbai and i want to come back to Mumbai";
    // String s = "Mumbai";
     int count =0;
     System.out.println("ENtr string");
     System.out.println("word to be search");
     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     String s = sc.nextLine();
   
    
     str.toLowerCase();
     s.toLowerCase();
     String[] splitStr = str.split("\\s+");
     
     for(int i=0;i<splitStr.length;i++) {
    	 if (splitStr[i].contains(s)) {
    		count ++;
    	 }
    	 System.out.println(splitStr[i]);
     }     
    System.out.println(count);
     
     
//     char [] arr = str.toCharArray();
//     char [] arr2 = s.toCharArray();
//     int count = 0;
//     int wordcount = 0;
//     int maxLength = s.length();
//      
//     for (int i=0;i<arr.length;i++) {
//    	 
//    	  
//    	  if (arr[i] != ' ' && arr[i] == arr2[count]) {
//    		  count ++;  
//    	  }
//    	  
//    	  if (arr[i] == ' ') {
//    		  count = 0;
//    	  }
//    	  
//    	  if (count == maxLength)
//    	  {
//    		  wordcount ++;
//    	  }
//    	 
//     }
//     
//      System.out.println("The Count of MUmbai word is :"+wordcount);
//      
//      
//      SingleTone o = SingleTone.getInstace();
//      System.out.println(o.hashCode());
//      
//
	}

}
