package Core_java_ass2;
import java.util.*;
class Q9
{
    public static void main(String args[])
    {
        int a;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Day = ");
        a=sc.nextInt();
        int year= a/365;
        a=a%365;
        System.out.println("year="+year);
        int month =a/30;
        a=a%30;
        System.out.println("month="+month);
        int day=a/7;
           a=a%7;
        System.out.println("day="+a);
        
        
    }
}