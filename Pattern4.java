package Assignment2;
class Pattern4
{
    public static void main(String args[])
    {
        for(int i=1;i<=9;i++)
        {
            for(int j=9;j>=i;j--)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++)
            {

                System.out.print(k+" ");
            }
          
            for(int n=i-1;n>=1;n--)
            {
                
                System.out.print(n+" ");
            }       
            System.out.println();
        }
    }
}