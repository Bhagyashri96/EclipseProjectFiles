
public class ReverseStringWithRecurssion {
	
	String message="Amaannal";// 15231 4->1+2+3+1 int[] arr=new int[]{1,5,2,3,1}
	char[] arr=new char[message.length()];
	int size=message.length()-1;
	int count=0;
	public String reverseString() {
		
		if(size>=0) {
			arr[count++]=message.charAt(size);
			size--;
			reverseString();
		}
		String newMessage=new String(arr);
		return newMessage;
	}
	
	public static void main(String[] args) {
		
		ReverseStringWithRecurssion recurssion=new ReverseStringWithRecurssion();
		String s = recurssion.reverseString();
		System.out.println(s);
		
		
		//reverse with for
		String message="Amaanala";
		char[] arr = new char[message.length()] ;
		int size=message.length()-1;
		for(int i=0;i<message.length();i++) {
			
				arr[i] =message.charAt(size);
				size--;
		}
		String newMessage=new String(arr);
		System.out.println(newMessage);
		
	}

}
