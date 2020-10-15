package Core_java_ass2;
class Q3D
{
    public static void main(String args[])
    {
        boolean x=true;
        boolean y=false;
        boolean z=x && y || !(x || y) ;
        System.out.println(z);
    }
}