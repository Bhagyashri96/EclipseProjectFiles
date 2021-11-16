import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateFromArray {
	

	public static void main(String args[]) {
		
		String s= "22";
		
		
		List<String> arr = new ArrayList<>();
           
		arr.add("Mango");
		arr.add("Banana");
		arr.add("Garpes");
		arr.add("Mango");
		
		System.out.println(arr);
		
		Set<String> set = new HashSet<String>(arr);
		  System.out.println(set);
		
		  
		  String[] arr1 = new String[]{"Yellow","Red","Yellow","Green"};
		  //System.out.println(arr1);
		  Set<String> set1 = new HashSet<>(Arrays.asList(arr1));
		  System.out.println(set1);
	}
	


}
