class Base {
	private void disp() {
		 System.out.println("Base static disply");
	 }
	
	void disp1() {
		System.out.println("Base disp");
	}
	
}

public class Derived  extends Base{

	void disp() {
		System.out.println("Derived disp");
	}
	
	
	public static void main(String[] args) {
		Base b = new Derived();
		//b.disp();
		//disp1();
		//Base.disp1();
		//b.disp1();
	}

}
