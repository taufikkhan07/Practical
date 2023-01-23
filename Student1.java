class Student2
{
int slno;
String name;
}
class Student1{
public static void main(String args[])
{
Student2 s = new Student2();
s.slno=01;
s.name="Taufik";
System.out.println(s.slno);
System.out.println(s.name);
s.slno=2;
s.name="Sonu";
System.out.println(s.slno);
System.out.println(s.name);
}
}