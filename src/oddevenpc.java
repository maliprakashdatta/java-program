import java.util.Scanner;
public class oddevenpc
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the positive Number:-" );
        int no=scanner.nextInt();
        if(no%2==0)
        {
            System.out.println("this is even Number");
        }
        else
        {
            System.out.println("this is odd Number");
        }
    }
}
