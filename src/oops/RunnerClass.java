package oops;

public class RunnerClass {

public static void main(String[] args) {
	
	Employee e1 = new Employee("Renu Maurya", 1234, "HR");
	Employee e = new Employee("Renu Maurya", 1234, "HR");
	e.Name="Himanshu Maurya";
	e.Empid=12345;
	e.department="Engineering";
	e.Display();

	
	e1.Display();
	
	Bank B = new Bank();
	B.displayBalance();
	
	int Bal = B.getBalance();
	
	System.out.println("The balance is " + Bal);
	
	}

	BOABank BOA1 = new BOABank();
	
}
