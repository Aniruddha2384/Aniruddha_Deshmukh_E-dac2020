interface School{
	public abstract  void display();
	
}
class Teacher implements School
{
	public void display()
	{
		System.out.println("I am Teacher in school.");
	}
}
class Student implements School
{
	public void display()
	{
		System.out.println("I am Student in school.");
	}
}
public class Solution3 {

	public static void main(String[] args) {
		Student s=new Student();
		s.display();
		
		Teacher t=new Teacher();
		t.display();

	}

}
