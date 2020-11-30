/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author icon
 */
public class Quque {
int n=6;
   int arr[]=new int[n];
   int rear=-1;
   int front=0;
   void enQueue(int x)
   {
       if(isfull())
       {
           System.out.println("Stack is Full");
       }
       arr[++rear]=x;
   }
    int deQueue() {
			    int element;

			    
			    if (isempty()) {
			      System.out.println("Queue is empty");
			      return (-1);
			    }
			    else {
			    
			      element = arr[front];

			      
			      if (front >= rear) {
			        front = -1;
			        rear = -1;
			      }
			      else {
			       
			        front++;
			      }
			 
			      return (element);
			    }
			  
   }
   boolean isfull()
   {
        return rear==n-1;
   }
   boolean isempty()
   {
       return rear==front;
   }
   void display()
   {
       for(int i=front;i<=rear;i++)
           System.out.println(arr[i]);
   }
    public static void main(String[] args) {
      
        Quque tr =new Quque();
        
        tr.enQueue(10);
                tr.enQueue(20);
                   tr.enQueue(2);
               tr.enQueue(3);
               tr.enQueue(30);
             tr.deQueue();
             tr.deQueue(); 
 tr.enQueue(31);

        tr.display();
    }
    
}
