
public class ReverseMatrixWith90degree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = {
				{2,8,2},
				{3,6,8},
				{7,6,1}
				};
		System.out.println("Before 90 degree roattaion \n");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix[i][j] +" ");
			}
			System.out.println("\n");
		}
		
		int arr[][] = new int[3][3];
		//output
		/*
		 * 7 3 2
		 * 6 6 8
		 * 1 8 2
		 */
		
		
		/*
		 * for(int row=2;row <=0 ;row++) { int col = 0; for (col=0;col<=2;col) {
		 * 
		 * } col ++; }
		 */
		
		System.out.println("after  90 degree roattaion \n");
		int m=0; //col
		for(int i=0;i<matrix.length;i++) {
			int k=2;//row
			for(int j=0;j<matrix.length;j++) {
				System.out.print(matrix[k--][m] +" ");
		}
			System.out.println("\n");
			m=m+1;
	}
				
		/*System.out.println("after  90 degree roattaion \n");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix[i][j] +" ");
			}
			System.out.println("\n");
		}
*/		
	} 

	
	
	
	
}
