//Write a program to print out all Armstrong numbers between 1 and 500.
// If sum of cubes of each digit of the number is equal to
// the number itself, then the number is called an Armstrong number.
package HomeWork;
public class ProgramTwentyThree23 {
    public static void main(String[] args) {
        int number,   b,  sum = 0;
        System.out.print("Armstrong numbers 1 to 500:");
        for(int i = 1; i <= 500; i++)
        {
            number = i;
            while(number > 0)
            {
                b = number % 10;
                sum = sum + (b * b * b);
                number = number / 10;
            }
            if(sum == i)
            {

                System.out.print(i+" ");

            }
            sum = 0;
        }

    }
}
