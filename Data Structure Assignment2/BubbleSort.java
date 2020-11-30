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
public class BubbleSort {

   
    public static void main(String[] args) {
       int arr[]={5,1,6,2,4,3};
       int temp=0;
       for(int i=0;i<arr.length-1;i++)
       {
           for(int j=0;j<arr.length-1-i;j++)
           {
               if(arr[j]>arr[j+1]){
                    temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               
           }
       
         for(int k:arr)
           System.out.print(k+"   ");
         System.out.println();
    }}

}
}
