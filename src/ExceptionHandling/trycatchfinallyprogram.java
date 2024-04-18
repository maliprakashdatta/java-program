package ExceptionHandling;

public class trycatchfinallyprogram
{
    public static void main(String[] args)
    {
        System.out.println("Code is learning..");
        try {
            int a=20,b=5,c;
            c=a/b;
            System.out.println(c);
        }
       catch (ArithmeticException a)
       {
           System.out.println("Cant Devide by Zero...");
       }
        finally {
            System.out.println("IS OK");
        }
    }
}
