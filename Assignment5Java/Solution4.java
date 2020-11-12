interface Collage{
	public abstract  void collage_detail();
	
}
interface Exam{
	public abstract  void exam_detail();
	
}
class Students implements Collage,Exam
{
	public void collage_detail()
	{
		System.out.println("I am student of CDAC Mumbai..");
	}
	
	public void exam_detail()
	{
		System.out.println("My exam on 9 Novwmber 2020...");
	}
}
public class Solution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Students s=new Students();
s.collage_detail();
s.exam_detail();
		
	}

}
