/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice1;
import java.util.Stack;

/**
 *
 * @author icon
 */
public class Stack1 {

   
    public static void main(String[] args) {
       Stack <Integer> t=new <Integer> Stack();
       t.push(20);
       t.push(30);
       t.push(200);
       t.push(300);
       int x=t.search(200);
     
       System.out.println(" "+t);
          System.out.println(" "+x);
    }
    
}
