//Calculate  series : 1^2+2^2+3^2+4^2+.........+n^2

package Assignment4;
import java.util.*;
public class SeriesSum {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the value of n: ");
		int a = sc.nextInt();
		int sqr = 0;
		
		for (int i=1; i<=a; i++)
		{
			int add = i*i;
			System.out.println(add);
			sqr = sqr + i*i;		
		}
		System.out.println("Sum of the series is: "+sqr);
		sc.close();
	}
}
