
public class SumOFminAndMaxNoSeq {

	
	//int[] arr=new int[]{1,5,2,3,1};1-?5 1->5 1->2 1->3 1->1 1
	
	//1,3,3,3,5,5,1,6->op 2
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int maxsum =0;
	 int minsum=0;
	 int[] arr=new int[]{1,5,2,3,1};//11235
	 char [] ch = new char[] {'a','b'};
	 int[] minArr = new int[4];
		int[] maxArr = new int[4];
		
	 
	 for (int i=0;i<arr.length;i++) {
		 for(int j=i+1; j<arr.length;j++) {
			 if(arr[i] > arr[j]) {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
			 }
		 }
	 }
	 int size=arr.length-1;
	 for (int i=0;i<4;i++) {
		 minsum = minsum+ arr[i];
			 maxsum = maxsum+ arr[size-i];
		 
	 }
	
	 System.out.println("Minsum is:" +minsum +"\n MaxSum is :"+maxsum);

	}
}
