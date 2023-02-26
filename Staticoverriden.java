package Assignments;
// we can't override static method
//parent class

 class Base {
	//non-static method which will be overriden in derived class
	public int add(int a,int b) {
		System.out.println("In the base class");
		return a+b;
	}
	//static method which will not be overriden in the derived class
public static void print() {
	System.out.println("In the base class");
}
}
//child class
class Derived extends Staticoverriden{
	//this method overrides add() of base class
	//because it is not a static method
	public int add(int a,int b) {
		System.out.println("In the child class.");
		return a+b;
	}
	//this method is hidden by print() in base class
	public static void print() {
		System.out.println("In the child class.");
	}
}
//main class
public class Staticoverriden{
	
	public static void main(String[] args) {
		Staticoverriden obj=new Derived();
		// here derive's add() is called
		//according to overriding rules.
 System.out.println(((Derived) obj).add(4,5));
 //this should invoke the print method of class derived.
 //as per overriding rules.
 //because a static method can't be overridden,
 //it uses base's print insted
 ((Derived) obj).print();
}


}