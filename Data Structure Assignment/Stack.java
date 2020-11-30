/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice1;


public class Stack {
int arr[]=new int[5];
int top=-1;
int size=5;

     boolean isfull()
     {
     return top==size-1;
         
     }
     boolean isempty()
     {
         return top==0;
     }
     void push(int data )
     {
         if(isfull())
         {
             System.out.println("Stack is full");
         }
         arr[++top]=data;
     }
     void pop()
     {
         if(isempty())
         {
             System.out.println("Stack is empty");
         }
         top--;
     }
     void display()
     {
         for(int i=0;i<=top;i++)
         {
             System.out.print(arr[i]+"   ");
         }
     }
    public static void main(String[] args) {
      Stack t=new Stack();
      t.push(1);
      t.push(20);
     t.push(200);
  t.pop();
t.display();    }
    
}
