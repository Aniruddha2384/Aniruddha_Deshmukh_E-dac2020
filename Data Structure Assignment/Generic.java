
package Data;


public class Generic <T>
{
    T t;
    void display(T x ,T y)
    {
        T t=x;
        x=y;
        y=t;
        System.out.println(x +"     "+y);

    }
    public static void main(String[] args) {
     Generic tr=new Generic();
     Integer x=new Integer(10);
     Integer y=new Integer(20);
     Double x1=new Double(100);
     Double y1=new Double(200);
     tr.display(x1, y1);
    }
    
}
