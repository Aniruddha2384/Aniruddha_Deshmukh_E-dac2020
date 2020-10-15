package Core_java_ass2;
import java.util.*;
class Q13
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a=sc.nextInt();
        System.out.println("Enter the value of B");
        int b=sc.nextInt();
        System.out.println("Enter the value of C");
        int c=sc.nextInt();
        if(a>b && b>c)
        {
            System.out.println(" A is Greater ="+a);
        }
        else if(b>c && b>a)
        {
            System.out.println("B is Greater="+b);
        }
        else 
        {
            System.out.println("C is Greater="+c);
        }
    }
}