//Write a program to print Fibonacci series of n terms where n is input by user :
//0 1 1 2 3 5 8 13 24 .....
package HomeWork;
public class ProgramTwentyFour24
{
    public static void main(String[] args) {
        int number1=0,number2=1,number3,i,count=10;
        System.out.print(number1+" "+number2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            number3=number1+number2;
            System.out.print(" "+number3);
            number1=number2;
            number2=number3;
        }

    }
}
