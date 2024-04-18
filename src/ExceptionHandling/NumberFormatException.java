package ExceptionHandling;

public class NumberFormatException
{
    public static void main(String[] args)
    {
        System.out.println("Check the number Format Exception");
        String Str="8830";
                try
                {
                    int n=Integer.parseInt(Str);
                    System.out.println(n);
                }
             catch(Exception n)
             {
                 //System.out.println("Is Cant"+n+" Conver the Char to int");
                 System.out.println(n);
             }

        System.out.println("Main method is ended..");
    }
}
