package Core_java2;
class Q4
{
    public static void main(String args[])
    {    int sum=0;
        for(int i=12;i<=102;i=i+10)
        {
            sum=sum+i;
               System.out.print(i+"+");
        }
        System.out.println("\b="+sum);
    }
}