package Core_java_ass2;
import java.util.*;
class Q10
{
    public static void main(String args[])
    {
        float d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temp=");
        d=sc.nextFloat();
        float c=5*(d-32)/9;
        System.out.println(+c);
    }
}