package containment;

public class Emp {

	private int empId;
	private String empName;
	private Date dt_of_joining;
	
	public Emp() {}
	
	public Emp(int empId,String empName,Date dt_of_joining)
	{
		this.empId=empId;
		this.empName=empName;
		this.dt_of_joining=dt_of_joining;
	}

	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + 
	empName + ", dt_of_joining=" + dt_of_joining + "]";
	}
	
	public static void main(String[] args) {
		Emp e=new Emp(1,"nickson",new Date(2,3,2026));
		System.out.println(e);
	}
}
