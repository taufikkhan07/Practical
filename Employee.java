package taufik.com;
public class Employee {
	long employeeId;;
	String employeeName;
	String employee_Address;
	long employee_Phone;
	double basicSalary;
	double specialAllowance=250;
	double Hra=1000;

	public Employee(long Id,String Name,String Address,long Phone) {
		this.employeeId=Id;
		this.employeeName=Name;
		this.employee_Address=Address;
		this.employee_Phone=Phone;
	}
	
	void calculateSalary() {
		double salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
		System.out.println("Salary of "+employeeName+" is "+salary);
		
	}
	void calculateTransportAllowance() {
		double transportAllowance=10*basicSalary/100;
		System.out.println(employeeName+" Transport Allownance is:"+transportAllowance);
	}
	}
class Manager extends Employee {
public Manager (long Id,String Name, String Address,long Phone,double Salary) {
	super(Id,Name,Address,Phone);
	super.basicSalary=Salary;
}
void calculateTransportAllowance() {
	double transportAllowance=15*basicSalary/100;
	System.out.println(employeeName+" Transport Allowance is: "+transportAllowance);
}
}
class Trainee extends Employee{
	
	public Trainee(long Id,String Name,String Address,long Phone,double Salary) {
		super(Id,Name,Address,Phone);
		super.basicSalary=Salary;
	}
}
	
