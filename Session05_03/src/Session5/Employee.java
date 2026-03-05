package Session5;

import java.util.TreeSet;

public class Employee {

	 int empId;
	 String empName;
	
	public Employee() {}
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	public int compareTo(Object o)
	{
		int id1=this.empId;
		Employee e=(Employee)o;
		int id2=e.empId;
		
		if(id1<id2)
			return -1;
		else if(id1>id2)
			return +1;
		else
			return 0;
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee(121,"Nickson");
		Employee e2=new Employee(122,"Rojar");
		Employee e3=new Employee(123,"Girish");
		Employee e4=new Employee(124,"Kumar");
		Employee e5=new Employee(125,"Saran");
		
		//TreeSet<Employee> t=new TreeSet<Employee>();
		TreeSet<Employee> t=new TreeSet<Employee>(new MyComp());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		
		System.out.println(t);
	}
}
