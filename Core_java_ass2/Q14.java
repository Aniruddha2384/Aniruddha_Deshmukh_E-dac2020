package Core_java_ass2;
import java.util.*;
class Q14
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int a=sc.nextInt();
        if(a%400==0)
        {
            System.out.println(a+"is Leap Year");
         }
        else if(a%100==0)
        {
            System.out.println(a+"is Not Leap Year");
        }
        else if (a%4==0)
        {
            System.out.println(a+"is Leap");
            
        }
        else 
        {
            System.out.println(a+"is not Leap Year");
        }
  
     
    }
}