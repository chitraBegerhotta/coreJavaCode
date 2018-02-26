package learnJava3;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class Employee {
	private int id;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	private String name;
	
	public Employee(int id, String name){
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}

public class CollectAddingObject {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(1, "Blake");
		Employee employee2 = new Employee(2, "Karen");
		Employee employee3 = new Employee(3, "Henry");
		Employee employee4 = new Employee(2, "Karen");
		
		
		Map<Employee, Integer> map = new LinkedHashMap<Employee, Integer>();
		
		map.put(employee1,1);
		map.put(employee2,9);
		map.put(employee3,8);
		map.put(employee4,1);
		 
		for(Employee key: map.keySet()){
			System.out.println(key + ":" + map.get(key));
		}
		
		Set<Employee> set = new HashSet<Employee>();
		
		set.add(employee1);
		set.add(employee2);
		set.add(employee3);
		set.add(employee4);
		
		for(Employee element: set){
			System.out.println(element);
		}
		
	}

}
