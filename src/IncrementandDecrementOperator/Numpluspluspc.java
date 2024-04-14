package IncrementandDecrementOperator;
import java.util.Scanner;
public class Numpluspluspc
{
    public static void main(String[] args)
    {
        System.out.println("Enter the Starting Number:-");
        Scanner scanner=new Scanner(System.in);
        int numcount=scanner.nextInt();
        System.out.println("****Incremented Numcount****");
        while (numcount<=100)
        {
            System.out.println(+numcount);
            numcount++;
        }
        System.out.println("****End Incremented Numcount****");
    }

}
