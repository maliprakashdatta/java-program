//Compute the natural logarithm of 2, by adding up to n terms in the series
//1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
//where n is a
//// positive integer and input by user.
package HomeWork;
import java.util.Scanner;
public class ProgramTwentySix26
{

        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of terms (n): ");
            int n = scanner.nextInt();

            double approximation = calculateNaturalLogarithm(n);
            System.out.println("Approximation of ln(2) with " + n + " terms: " + approximation);
            System.out.println("Actual value of ln(2): " + Math.log(2));

            scanner.close();
        }

        public static double calculateNaturalLogarithm(int n) {
            double result = 0.0;
            for (int i = 1; i <= n; i++) {
                result += Math.pow(-1, i + 1) * (1.0 / i);
            }
            return result;

        }
}
