package Core_java2;
import java.util.*;
class Q8
{
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter array size");
            int n=sc.nextInt();
        int arr[] = new int [n];
        System.out.println("enter array element");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
                System.out.println("Reverse order");
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }

       
    }
}