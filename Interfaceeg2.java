package Feb28;

interface Shape{
	void shape_name();
}
class User_Circle implements Shape{
	@Override
	public void shape_name() {
		System.out.println("Draw a circle");
	}
}
class User_Traingle implements Shape{

	@Override
	public void shape_name() {
		System.out.println("Draw a traingle");
	}
	}
public class Interfaceeg2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape object = new User_Traingle();
		object.shape_name();

	}

}
