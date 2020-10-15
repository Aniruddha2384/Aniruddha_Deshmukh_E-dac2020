package Core_java_ass2;
import java.util.*;

class Q6
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Redius=");
      int r=sc.nextInt();
      double area=3.14*r*r;
      double cir =2*3.14*r;
      System.out.println("Area ="+ area +"    Circumference=" +cir);
    }
}