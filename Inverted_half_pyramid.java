package Assignment2;
class Inverted_half_pyramid
{
    public static void main(String args[])
    {
        for(int i=1;i<=6;i++)
        {
            for(int j=6;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
                
        }
    }
}