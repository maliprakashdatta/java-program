///Write a do-while loop that asks the user to enter two numbers.
// The numbers should be added and the sum displayed.
// The loop should ask the user whether he or she wishes to perform the operation again.
// If so, the loop should repeat; otherwise it should terminate.
package HomeWork;
import java.util.Scanner;
public class ProgramTwenty20
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        char op;
        do{
            System.out.println("Enter First numbers");
            int nummer= in.nextInt();
            System.out.println("Enter Second numbers");
            int number = in.nextInt();
            sum= number+number;
            System.out.println("`````````````````````````````````");
            System.out.println("wishes to perform the operation again, Y/N");
            op =in.next().charAt(0);
        }while(op =='Y'||op=='y');
        System.out.println("sum "+sum);

    }
}
