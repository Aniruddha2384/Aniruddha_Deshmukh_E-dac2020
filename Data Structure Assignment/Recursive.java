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
public class Recursive {
    
        int fact(int n)
        {if(n==0)
            return 1;
        else
             return n*fact(n-1);
            
}
    public static void main(String[] args) {
      int n=5;
      Recursive t=new Recursive();
     
      System.out.println(t.fact(n));
     
            }
    }
    
}
