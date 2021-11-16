package designPattern;

public class StaticBlockSingleton {
	 
	private static  StaticBlockSingleton staticBlockSingltonInstance ;
	
	private StaticBlockSingleton() {
	}

	static {
		 try {
			 staticBlockSingltonInstance = new StaticBlockSingleton();
		 }catch (Exception e) {
			 
		 }
	}
	
	
	public static StaticBlockSingleton getInstance() {
	  return staticBlockSingltonInstance;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
