//Write a program to calculate the sum of following series where n is input by user.
//1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
//// Java Program to find sum of series
package HomeWork;
public class ProgramTwentyFive25
{
    public static void main(String[] args)
    {
        static double sum(int n)
        {
            double i, sum = 0.0;
            for (i = 1; i <= n; i++)
                sum = sum + 1/i;
            return sum;
        }


        // Driven Program
        public static void main(String args[])
        {
            int n = 5;
            System.out.printf("Sum is %f", sum(n));

        }


}
