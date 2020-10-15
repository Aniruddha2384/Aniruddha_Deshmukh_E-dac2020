package Core_java_ass2;
import java.util.*;
class Q11
{
    public static void main(String args[])

    {
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the first value");
       int a=sc.nextInt();
       System.out.println("Enter the Second value");
       int b=sc.nextInt();
       
       b=a+b;
       a=b-a;
       b=b-a;
       System.out.println("after swap");
       System.out.println(a);
       System.out.println(b);
               
       
    }
        }