package taufik.com;

public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager(126534,"Peter","Chennai India",237844,65000);
		Trainee t=new Trainee(29846,"Jack","Mumbai India",442085,45000);
		m.calculateSalary();
		m.calculateTransportAllowance();
		t.calculateSalary();
		t.calculateTransportAllowance();

	}

}
