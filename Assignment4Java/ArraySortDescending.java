package Assignment4;

public class ArraySortDescending 
{
	public static void main(String[] args)
	{
		int[] arr =  {34,56,78,32,12,34,44,90,100,234,2456};
		   int temp = 0;
	    System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) 
        {     
            System.out.print(arr[i] + " ");    
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) 
        {     
            for (int j = i+1; j < arr.length; j++) 
            {     
              if(arr[i] < arr[j]) 
            	   //if (arr[i]> arr[j])//for ascending
               	{    
                   temp = arr[i];   
                   arr[i] = arr[j];   
                   arr[j] = temp;    
               	}     
            }
		
        }
        System.out.println("Elements of array sorted in descending order: ");    
        for (int i = 0; i < arr.length; i++) 
        	{     
            System.out.print(arr[i] + " ");    
            }
	}
}
