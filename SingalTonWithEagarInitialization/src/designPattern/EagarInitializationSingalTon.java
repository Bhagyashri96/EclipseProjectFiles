package designPattern;

public class EagarInitializationSingalTon {
	
	private static final EagarInitializationSingalTon instancevar = new EagarInitializationSingalTon();
			
	private EagarInitializationSingalTon() {}
	
	public static EagarInitializationSingalTon  getInstance() {
		System.out.println("Creating instace during class loading");
		return instancevar;
	}
	
	public static void main(String[] args) {
		getInstance();
	}
   
}
