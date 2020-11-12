package Assignment4;
import java.util.*;
public class PrimeNumbersRange {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Starting Number : ");
		int a = sc.nextInt();
		System.out.print("Enter Ending Number : ");
		int b = sc.nextInt();
		System.out.println("Prime numbers between "+a+" and "+b+" are : ");
		int count;
		for(int i = a ; i <= b ; i++)
		{
			count = 0;
			for(int j = 1 ; j <= i ; j++)	
			{
				if(i % j == 0)
					count = count+1;
			}
			if(count == 2)
				System.out.println(i);
		}
		sc.close();
	}
}
