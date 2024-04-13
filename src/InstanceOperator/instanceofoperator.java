package InstanceOperator;
class book
{
    void show()
    {
        System.out.println("Is a Java Books...");
    }
}
class  pan extends book
{}
public class instanceofoperator extends pan
{
    public static void main(String[] args)
    {
        System.out.println("----Output------");
        instanceofoperator i1=new instanceofoperator();
        System.out.println(i1 instanceof book);
        i1.show();
    }

}
