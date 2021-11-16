
public class Test extends Test2 {

	static void disp() {
		System.out.println("displ");
		
	}
	
	static {
		try {
		System.out.println("Static block 3");
		int r = 1/0;
		}catch(Exception e) {
			System.out.println("Excepton occured"+ e);
		}
	} 
	
	Test(){
		System.out.println("Constructor");
	}
	
	
	
	{
		System.out.println("Instance block");
	}
	
	
	static {
		System.out.println("Static block 1");
	}
	
	 public void disp2 () {
		System.out.println("disp2");
		disp3();
		
	}
	  
	 static void disp3 () {
			System.out.println("disp2");
		}
		
	
	static {
		System.out.println("Static block 2");
	}
	
	public static void main(String[] args) {
		//disp();
	 Test2 t = new Test();
//	 t.disp();
//	 t.disp2();
//	 disp();
//	 disp2();
	 Test.disp();
	// t.disp();
	t.disp3();

	}

}

class Test2 {
	
	 static void disp3() {
		System.out.println("Test2 disp3");
	}
}
