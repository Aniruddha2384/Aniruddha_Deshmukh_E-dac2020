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
public class InsearationSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int arr[]={5,1,6,2,4,3};
int temp=0;
for(int i=1;i<arr.length;i++)
{    temp=arr[i];
       int j=i;
       while(j>0 && arr[j-1]>temp)
       {
           arr[j]=arr[j-1];
           j=j-1;
           
       } 
       arr[j]=temp;
     for(int r:arr){
    System.out.print(r+"  ");

     }    System.out.println();}
}}
