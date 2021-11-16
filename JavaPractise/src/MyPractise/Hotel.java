package MyPractise;

public class Hotel {
 
	private String dish;
	
	
	public void orderDish (String dish) {
		cook(dish);
	}
	
	private void cook(String dish) {
		this.dish = dish;
		System.out.println("Dish is prepaed");
	}

	public static void main(String[] args) {
     
		Hotel h = new Hotel();
		h.orderDish("Pizza");		
	}
	


}
