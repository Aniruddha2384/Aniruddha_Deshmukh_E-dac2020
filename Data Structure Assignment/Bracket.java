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
public class Bracket {

    public static void main(String[] args) {
       String s="{{{(())}}}";
   Stack <Character> tr=new Stack<>();
     for(int i=0;i<s.length();i++)
     {   
         char a=s.charAt(i);
  if(a=='{'||a=='(')
  {
      tr.push(a);
      
  }
  else if(!tr.isEmpty() &&
                                 (a=='}'&&tr.peek()=='{') ||
                                  (s.charAt(i)==')' && tr.peek()=='('))
  {
   tr.pop();
   }

   }
     if(tr.isEmpty())
     {
         System.out.println("yes");
     }
     else
     {
        System.out.println("NO");  
     }
    }}