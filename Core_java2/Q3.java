package Core_java2;
import java.util.*;
class Q3
{
public static void main(String args[])
{
  int a=1;
    Scanner sc = new Scanner (System.in);
    int n=sc.nextInt();
    System.out.println("enter the  number");
    for (int i=2;i<n;i++)
    {
        if (n%i==0)
        {
         a=0;
         break;
      
        }
        }
    if(a==1)
    {
        System.out.println("its prime ");
        
    }
    else 
    {
     
        System.out.println("its not prime ");       
    }

}
}