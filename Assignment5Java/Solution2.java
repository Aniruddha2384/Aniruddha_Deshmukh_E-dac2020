class Employee{
	String compony_name="PKL";
	void print()
	{
		System.out.print("I am Employee");
	}
}
class Manager extends Employee{
	String id="PE_123";
	void print1()
	{
		System.out.println(" manager.");
	}
}
class Worker extends Employee{
	String id="w_456";
	void print2()
	{
		System.out.println(" worker.");
	}
}
public class Solution2 {
	public static void main(String args[])
	{
		Worker w=new Worker ();
		System.out.println(w.compony_name);
		System.out.println(w.id);
		w.print();
		w.print2();
		

	/*	Manager m=new Manager ();
		System.out.println(m.compony_name);
		System.out.println(m.id);
		m.print();
		m.print1();*/
		
		
	}

}
