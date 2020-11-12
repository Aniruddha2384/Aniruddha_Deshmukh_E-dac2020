package Assignment4;
import java.util.Scanner;
class ReverseNumberWhile
{
   public static void main(String args[])
   {
      int num;
      int reverse =0;
      System.out.println("Input number: ");

      Scanner in = new Scanner(System.in);
  
      num = in.nextInt();
 
      while( num != 0 )
      {
          reverse = reverse * 10;
          reverse= reverse + num%10;
          num = num/10;
      }

      System.out.println("Reverse number is: "+reverse);
      in.close();
   }
}