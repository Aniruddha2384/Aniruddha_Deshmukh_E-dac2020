package Assignment4;

import java.util.Scanner;

public class SumAndAvgArray 
{
	public static void main(String[] args)
	{
		int a, sum=0, avg=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		a=sc.nextInt();
		
		int[] arr = new int [a];
		
		System.out.println("Enter values: ");
		for (int i=0; i<a; i++)
		{
			
			arr[i]=sc.nextInt();
			
		}
		
	for (int i=0; i<a; i++)
	{
		sum = sum + arr[i];
		avg =sum/a;
		
	}
	System.out.println("Sum of the Elements is: " + sum);
	System.out.println("Average of the Elements is: " + avg);
		
	sc.close();
	}
	
}
