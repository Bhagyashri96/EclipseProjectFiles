package designPattern;

public class LazyLoadingSingleTon {
	
	private static LazyLoadingSingleTon instaces ;
	
	private LazyLoadingSingleTon() {}
	
	public static LazyLoadingSingleTon getInstace() {
		
		if (instaces == null) {
			 instaces = new LazyLoadingSingleTon();
		}
		return instaces;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
