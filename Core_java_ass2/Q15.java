package Core_java_ass2;
import java.util.*;
class Q15
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
               System.out.println("Enter the gender");
       char c = sc.next().charAt(0);

        System.out.println("Enter the age");
       int n=sc.nextInt();
       if(c=='m' )
       {
           if(n>=21)
           {
             System.out.println("Its eligible for marriage");   
       }
           else 
           {
                 System.out.println("Its Not eligible for marriage");
           }
       }
       else if(c=='f' )
       {
           if(n>=18)
           {
           System.out.println("Its eligible for marriage");
       }
           else
           {
                 System.out.println("Its Not eligible for marriage");
           }
       }
       else
       {
          System.out.println("Its not eligible for marriage"); 
       }
        
        
        
    }
}