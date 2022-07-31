package oops;

public class Employee {

	public String Name;
	public int Empid;
	public String department;

	public Employee(String Name, int Empid, String department) {
		this.Name=Name;
		this.Empid=Empid;
		this.department=department;
	}
	
	public void Display() {
		System.out.println(Name);
		System.out.println(Empid);
		System.out.println(department);
	}
	
}
