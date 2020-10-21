package Core_java2;
import java.util.*;
class Q9
{
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter number which find in array");
            int n=sc.nextInt();
        int arr[] = {22,33,44,55,88,99};
          System.out.println("search element");
        for(int i=0;i<6;i++)
        {
            
                if(arr[i]==n)
             System.out.println(arr[i]);
            
          
        }

       
    }
}