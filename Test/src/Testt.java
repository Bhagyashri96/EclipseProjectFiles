import java.util.Iterator;
import java.util.TreeSet;

public class Testt implements Comparable {

	
	public String name;
	public static void main(String[] args) {
		Testt o = new Testt();
		Testt o2 = new Testt();
		o.name = "cof";
		o2.name ="te";
		
		TreeSet<Object> se = new TreeSet();
		se.add(o);
		se.add(o2);
		
		Iterator<Object> it = se.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
