package Core_java2;
class Q7
{
    public static void main(String args[])
    {
        int temp=0;
      int arr[] = {111,2,35,4,5,66,7,8,9};
      for(int i=0;i<arr.length;i++)
      {
          for(int j=i+1;j<arr.length;j++)
          {
              if(arr[i]<arr[j])
              { 
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
              }
             
          }
      
                 System.out.println(arr[i]); 
      }
        
    }      
        
    
}