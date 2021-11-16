package MyPractise;

public abstract class Plane {
	
	public void startHeadlight() {
		System.out.println("Headlight Started");
	}
    
	public void startEngine() {
		System.out.println("Engine Started");
	}
	
	public abstract void EngineType();
}
