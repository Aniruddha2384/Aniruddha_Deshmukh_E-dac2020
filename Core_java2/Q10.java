  package Core_java2;

class Q10
{
    public static void main(String args[])
        {
            
           
           
            int evenSum=0;
            int oddSum=0;
        int arr[] = {22,33,44,55,88,99};
        
        for(int i=0;i<6;i++)
        {
            if(arr[i]%2==0)
            {
                evenSum += arr[i];
            }
            else
            {
                oddSum +=arr[i];
            }
         }   
        System.out.println("sum of all even number="+evenSum);
            System.out.println("sum of all odd number="+oddSum); 
    }
}     