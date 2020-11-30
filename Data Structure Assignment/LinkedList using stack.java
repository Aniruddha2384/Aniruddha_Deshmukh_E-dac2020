/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice1;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}
public class LinkedList
{
    Node head;
    void push(int data)
    {
        Node node =new Node(data);
        node.data=data;
        node.next=head;
        head=node;
       
    }
    void pop()
    {
        Node node1 =head;
        head=node1.next;
       
    }
    void display()
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+"  ");
            current=current.next;
        }
    }
    public static void main(String args[])

    {
        LinkedList tr=new LinkedList();
        tr.push(30);
        tr.push(45);
        tr.push(10);
        tr.pop();
        tr.display();
    }
}