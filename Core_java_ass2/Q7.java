package Core_java_ass2;
import java.util.*;
class Q7
{
    public static void main(String args[])
    {
       
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the five subjrct mark out of 100");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int s=a+b+c+d+e;
        float sum=(s*100/500);
        System.out.println(+sum+"%");
    }
}