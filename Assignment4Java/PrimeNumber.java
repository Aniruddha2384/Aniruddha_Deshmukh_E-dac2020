package Assignment4;
import java.util.Scanner;
public class PrimeNumber 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		int temp=0;
		for (int i=2; i<a; i++)
		{
			if(a%i==0)

			{
				temp=temp+1;
			}
		}
				if(temp==0)
				{
					System.out.println(a + " is a prime number.");
				}
			
				else
				{
					System.out.print(a + " is not a prime number.");
				
				}
			sc.close();
		}
	
}
