package Assignments;

public class Finalvariable {
	final int value=50;// final varible
	void display() {
		System.out.println(value);
	}
// we can't change the value of final variable
	//value=70; //compile time error
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalvariable fv=new Finalvariable();
		fv.display();

	}

}
