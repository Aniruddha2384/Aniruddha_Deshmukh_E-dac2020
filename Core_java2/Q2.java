package Core_java2;
import java.util.*;
class Q2
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the five digit number=");
        int n=sc.nextInt();
        for(int i=1;i<=5;i++)
        {        
            int a=n%10;
        
        n=n/10;
        System.out.print(+a);
      
        }
      System.out.println();  
    }
}