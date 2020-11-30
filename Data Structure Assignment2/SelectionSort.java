/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author icon
 */
public class SelectionSort {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temp=0;
        int arr[]={5,1,6,2,4,3};
    for(int i=0;i<arr.length;i++)
    {for(int j=i+1;j<arr.length;j++)
    {
        if(arr[i]>arr[j])
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
        }
    
    for(int r:arr){
    System.out.print(r+"  ");
    
    }  System.out.println();
    }}

    }
    
}
