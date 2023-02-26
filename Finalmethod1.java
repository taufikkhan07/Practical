package Assignments;

class Finalmethod1 {

void display() {
	System.out.println("This is a final method.");
	
}
}
class Child1 extends Finalmethod1{
	public final void display() {
		System.out.println("The final method is overridden.");
		
	}
	
}
 class Finalmethod{
	public static void main(String[] args) {
		Child1 obj=new Child1();
		obj.display();
	}
}
