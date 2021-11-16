package MyPractise;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		/*
		 * String S = "HelloWorld";//in.next(); int start = 3;//in.nextInt(); int end =
		 * 7;//in.nextInt(); char[] ch= S.toCharArray(); for (int i=0;i<ch.length-1;i++)
		 * { if(i>=start && i<end){ System.out.print(ch[i]); } }
		 */

		
//		  String smallest = ""; String largest = "";
//		  
//		  String s = "welcometojava"; 
//		  int n = 3;
//		  SortedSet<String> tree = new TreeSet<String>(); 
//		  for (int i =0 ;i<=s.length()-n;i++) {
//		  tree.add(s.substring(i,i+n)); }
//		  
//		  System.out.println(tree);
//		  
//		  smallest = tree.first();
//		  largest = tree.last();
//		  
//		  System.out.println("Smalles :"+ smallest +"\n"+ "largets :" + largest);
		 

		
		
//		  for (int i=0,j=d.length-1;i<d.length-1 && j<=0;i++,j--) {
//			  
//			  if (!(i==j)) {
//			     if(d[i]== d[j]) {
//			    	 c = 1; 
//		  	     }
//		      } 
//		   }
		  
//		  int c = 0; String d1= "llevell"; 
//		  char[] d = d1.toCharArray();
//		  boolean flag = false;
//		  int mid = d.length/2;
//		  int maxlenght = d.length-1;
//		  for (int i=0;i<=d.length-1;i++) {
//			  if (i == mid) {
//				  break;
//			  }else {
//				  if (d[i] == d[maxlenght]) {
//					   flag = true;
//				  }else {
//					  flag = false;
//					  break;
//				  }
//				  maxlenght --;
//			  }  
//		  }
//		
//		  if (flag) {
//			  System.out.println("Yes"); }else { System.out.println("No"); 
//		   }
		 
		
//		String s1 = "AAbb";//"anagram";
//		String s2 = "AAbba";//"margana";
//		
//		boolean flag = false;
//		char [] c1= s1.toCharArray();
//		char [] c2 = s2.toCharArray();
//		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
//		
//		for (int i=0;i<=s1.length()-1;i++) {
//			if (map1.containsKey(s1.charAt(i))) {
//				map1.put(s1.charAt(i),map1.get(s1.charAt(i))+1);
//			}else {
//				map1.put(s1.charAt(i),1);
//			}
//		}
//			
//		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
//		for (int i=0;i<=s2.length()-1;i++) {
//			if (map2.containsKey(s2.charAt(i))) {
//				map2.put(s2.charAt(i),map2.get(s2.charAt(i))+1);
//			}else {
//				map2.put(s2.charAt(i),1);
//			}
//		}
//		
//		
//		
//		for (Map.Entry<Character,Integer> entry: map1.entrySet()) {
//			if (map1.size()== map2.size()) {
//			if(map2.containsKey(entry.getKey())) {
//				if(map2.get(entry.getKey()).equals(entry.getValue())){
//					flag = true;
//				}else {
//					flag = false;
//					break;
//				}
//			 }
//			}
//		}
//		
//		
//		if (flag) {
//			System.out.println("Anagrams");
//		}else {
//			System.out.println("Not Anagrams");
//		}
//		
//		
		
		
//		String s2 = "hello";//102
//		String s1= "java";//106
//		boolean flag = false;
//		String s3 = s1+" "+s2;
//		char []c =s3.toCharArray();
//		char[] c2 = new char[s3.length()];
//	
//		boolean f= false;
//		if (s1.charAt(0) > s2.charAt(0)) {
//		    flag = true;
//		}else {
//			flag = false;
//		}
//		
//	    for(int i=0; i<c.length;i++) {
//	    	if (f) {
//	    		c2[i] = Character.toUpperCase(c[i]);	
//	    		f= false;
//	    	}else if(i==0) {
//	    		c2[i] = Character.toUpperCase(c[i]);
//	    	}else if(c[i] == ' ') {
//	    		f=true;
//	    		c2[i] = c[i];
//	    	}else {
//	    		c2[i] = c[i];
//	    	}
//	    	
//	    }
//        
//	    String s4 = new String();
//		System.out.println(s1.length() + s2.length());
//	       System.out.println(flag != true ? "No":"yes");
//		System.out.println(c2);
//	
	
	
	}

}
