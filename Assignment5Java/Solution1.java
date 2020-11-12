class Bank{
	String name="SBI";
	String id="SBIN0000123";
	String branch="Pune";
	void detail_b()
	{
		System.out.println("Im Bank...");
	}
}
class customer extends Bank{
	String c_name="Swapnil";
	String ac_no="123456";
	String acc_type="saving";
	
	void detail_c()
	{
		System.out.println("Im customer...");
	}
}
public class Solution1 {

	public static void main(String[] args) {
		customer c=new customer();
		System.out.println(c.ac_no);
		System.out.println(c.acc_type);
		System.out.println(c.branch);
		System.out.println(c.c_name);
		System.out.println(c.id);
		System.out.println(c.name);
		c.detail_b();
		c.detail_c();

	}

}
