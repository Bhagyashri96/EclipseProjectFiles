package designPattern;

public class Main {

	public static void main(String[] args) {
		//EagarInitializationSingalTon.getInstance();
		
		Boolean flag = false;
		//int index = 0L;
	    String message="good bad ugly";
	    
	    char[] arr = message.toCharArray();
		/*
		 * for (Character ch :arr) { ch.UPPERCASE_LETTER }
		 */
	    System.out.println("String Before : " + message);
	    for (int i=0; i<arr.length; i++) {
	    	   if (i==0) {
	    		   arr[i] =Character.toUpperCase(arr[i]);
	    	   }
	    	   
	    	   if (arr[i] == ' ') {
	    		   flag = true;
	    	   }
	    	   
	    	   if (flag.equals(true) && !(arr[i]== ' ')) {
	    		   arr[i]= Character.toUpperCase(arr[i]);
	    		   flag = false;
	    	 }
	    }
	    
	    String s = new String(arr);
	    System.out.println("String After : " + s.toString());	    
	}

	
	
}
