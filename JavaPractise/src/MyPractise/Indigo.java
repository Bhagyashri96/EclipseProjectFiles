package MyPractise;

public class Indigo extends Plane{

	@Override
	public void EngineType() {
		System.out.println("enegine type is..");
		
	}

	@Override
	public void startEngine() {
		//super.startEngine(); // super method call
		System.out.println("Indigo Engine started"); //Customization
	}
	
	public static void main(String args[]) {
		Indigo i = new Indigo();
		i.startEngine();
		i.startHeadlight();
		i.EngineType();
	}
}
