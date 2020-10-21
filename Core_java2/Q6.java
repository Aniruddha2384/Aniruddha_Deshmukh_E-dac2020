package Core_java2;

import java.util.Scanner;
class Q6
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
double sum=0;
int arr[]=new int[10];
for(int i=0;i<10;i++)
{
  arr[i]=sc.nextInt();
}
for(int i=0;i<10;i++)
{
 sum =sum+arr[i];
}
 double avg=sum/10;
System.out.println(avg);
}
}
