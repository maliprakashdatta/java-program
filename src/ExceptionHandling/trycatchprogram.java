package ExceptionHandling;

public class trycatchprogram
{
    public static void main(String[] args)
    {
        try {
            int Number=50/1; //This is throw exception

        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("Rest of the code");
    }



}
