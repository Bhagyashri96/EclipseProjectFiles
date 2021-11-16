
public class MAxREpititionCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr=new int[]{1,5,2,3,1};1-?5 1->5 1->2 1->3 1->1 1
		
		
		 int[] arr=new int[]{1,3,3,3,6,5,5,1,6};//3,3,3,5,5,1,6->op 2
		
		 for (int i=0;i<arr.length-1;i++) {
			 for(int j=i+1; j<arr.length;j++) {
				 if(arr[i] > arr[j]) {
	               int temp = arr[i];
	               arr[i] = arr[j];
	               arr[j] = temp;
				 }
			 }
		 }
		 
		 for (int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
		 
		 
		 int maxNum = arr[arr.length-1];
		 int count =0;
		 for (int i=0;i<arr.length;i++) {
			 if (arr[i] == maxNum) {
				count ++; 
			 }
		 }
		 System.out.println(count);
	}

}
