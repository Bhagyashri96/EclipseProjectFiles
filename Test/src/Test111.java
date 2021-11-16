import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test111 {
	
	
	public static void main(String[] args) {
		
   Map<Character,Integer> map = new HashMap<Character, Integer>();
		
   String  s = "Bhagayashri Pradip Patil" ;
   
   String [] str = s.split("");
   
   char [] arr = s.toCharArray();
   
   
   
   Map<Character, Long> output = s.chars().mapToObj( ch -> (char) ch ).filter(ch -> !ch.equals(' '))
		   .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
   
   output.forEach((k,v) -> System.out.println(k +" "+ v));
		   
	/*
	 * for (Map.Entry<Character, Long> m1 :output.entrySet()) {
	 * 
	 * System.out.println(m1.getKey() +" "+ m1.getValue());
	 * 
	 * }
	 */
		   
   
   
   
//   Map<String , Long> map =  Arrays.stream(stringarray)
//	        .collect(Collectors.groupingBy(c -> c , Collectors.counting()));
//	        map.forEach( (k, v) -> System.out.println(k + " : "+ v)        );
//	        
//	        
//	Map<String,Long> map = Arrays.stream(str).collect(Collectors.groupingBy(p -> p,Collectors.counting()));
//   
//   chalist.stream().collect()
   
	  
//	  for (int i = 0; i < arr.length-1; i++) {
//	  
//	  if (arr[i] != ' ') {
//		  
//	  if(!map.containsKey(arr[i])){
//		  Integer count = 1;
//		  map.put(arr[i], count);
//	  
//	  }else {
//		  Integer count = map.get(arr[i]);
//		  //count = count + 1;
//		  map.put(arr[i], ++count);
//		   }
//	  
//	   }
//	}
//	
   
  

	}

}
