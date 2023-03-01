package Feb28;
interface New_Employee{  // parent interface1
	void salary();
}
interface New_Developer{  // parent interface2
	void salary();
}
class New_Trainer implements New_Employee,New_Developer{
	@Override
	public void salary() {
		System.out.println("Salary Incremented");
	}
}

public class Multiple_Inheritance_Eg2 {
	public static void main(String[] args) {
		New_Trainer object=new New_Trainer();
		object.salary();
		
	}

}
