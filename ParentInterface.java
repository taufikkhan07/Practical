package Feb28;

interface ParentInterface {
	void show(); // by default method
}
class IntefaceEg1 implements ParentInterface{ // class implements interface
	@Override
	public void show() {
		System.out.println("parent Interface method");
	}
	public static void main(String[] args) {
		IntefaceEg1 object = new IntefaceEg1();
		object.show();
	}
	}
