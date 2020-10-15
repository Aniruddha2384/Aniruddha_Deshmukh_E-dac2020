package Core_java_ass2;
import java.util.*;
class Q12
{
    public static void main(String args[])
    {
    
            double hr,da;
            
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Amount =");
        double a=sc.nextDouble();
        if(a<10000)
        {
           hr=0.1*a;
           da=0.9*a;
           double gs=a+hr+da;
           System.out.println("Grocss Salary ="+gs);
        }
        
           else
           {
                  hr=2000;
                  da=0.98*a;
                  double gs=a+hr+da;
                  System.out.println("Grocss Salary="+gs);
                   }
        }
    }
