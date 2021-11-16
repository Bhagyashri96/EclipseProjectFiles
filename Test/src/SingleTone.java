
public class SingleTone {
	
	private static SingleTone instacevariable;
	
	private SingleTone() {
	}
	
	public static SingleTone  getInstace() {
		if (instacevariable == null) {
		   return instacevariable = new SingleTone();
		}
		return instacevariable;
	}
	
	public static void main(String[] args) {
		System.out.println(getInstace().hashCode());
		 SingleTone s = new SingleTone();
		 System.out.println(s.hashCode());
		
	}
	
	

}


