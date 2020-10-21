package Core_java2;
class Q5
{
 

    public static void main(String[] args) {

        int n =25, m= 75;

        while (n < m) {
            boolean flag = false;

            for(int i = 2; i <= n/2; ++i) {
               
                if(n % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && n != 0 && n != 1)
                System.out.print(n + " ");

            ++n;
        }
        System.out.println();
    }
}
       
       
    
       

