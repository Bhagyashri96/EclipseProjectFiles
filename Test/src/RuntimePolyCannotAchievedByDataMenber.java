
class Bike {
	int limit =6;
	
	int getLimit() {
		return limit = 6;
	}
}

public class RuntimePolyCannotAchievedByDataMenber  extends Bike {

	 int limit = 2;
	 
	 int getLimit() {
		 return limit = 2;
	 }
	 
	public static void main(String[] args) {
	   Bike r = new RuntimePolyCannotAchievedByDataMenber();
	   RuntimePolyCannotAchievedByDataMenber c= new RuntimePolyCannotAchievedByDataMenber();
	   System.out.println(r.limit +" "+ r.getLimit() + "  " + c.limit +" "+ c.getLimit());

	}

}
