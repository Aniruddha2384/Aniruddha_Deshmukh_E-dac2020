package Core_java_ass2;
import java.util.*;
class Q8
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the principle Amount=");
        double  p=sc.nextDouble();
        System.out.println("Enter the year=");
        double y=sc.nextDouble();
           System.out.println("Enter the rate=");
        double r=sc.nextDouble();
        double SI=(p*r*y)/100;
        System.out.println(SI);
    }
}