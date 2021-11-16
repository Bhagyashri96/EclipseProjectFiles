import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LearStream {

	public static void main(String[] args) {
		
		/*
		 * List<String> list = new ArrayList<>();
		 * 
		 * list.add("Prasanna"); list.add("Bhagyashri"); list.add("Dipa");
		 * list.add("Sapu"); list.add("Chinu"); list.add("Gondu");
		 * 
		 * List <String> list1 = list.stream().sorted().collect(Collectors.toList());
		 * 
		 * List <String> list2 =
		 * list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		 * 
		 * List <String> list3 =
		 * list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		 * 
		 * System.out.println(list);
		 * 
		 * System.out.println(list1);
		 * 
		 * System.out.println(list2);
		 * 
		 * System.out.println(list3);
		 */
		
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Bhagya" ,450000L));
		empList.add(new Employee(2, "Babu" ,350000L));
		empList.add(new Employee(3, "Sapu" ,250000L));
		empList.add(new Employee(4, "Didi" ,150000L));
		empList.add(new Employee(5, "Akka" ,50000L));

		System.out.println(empList);

        List <Employee> emp = empList.stream().sorted((o1,o2) ->o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
        
        System.out.println(emp);
        
       List <Employee> emp2 = empList.stream().sorted((o1,o2) ->o2.getName().compareTo(o1.getName())).collect(Collectors.toList());
        
        System.out.println(emp2);
        
        List <Employee> emp3 = empList.stream().sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
        
        System.out.println(emp3);
        
       List <Employee> emp4 = empList.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
        
        System.out.println(emp4);   
        
        
        List<Integer> l =  empList.stream().map(Employee::getId).collect(Collectors.toList()); 
        
        System.out.println(l);
        
	}

}

class Employee {
	
	int id;
	String name;
	Long salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, Long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
