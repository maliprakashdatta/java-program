//Write a program to create simple calculator using switch Statement
package HomeWork;
import java.util.Scanner;
public class ProgramSix
{
    public static void main(String[] args)
    {
        Scanner calculator=new Scanner(System.in);
        char Operator;
        Double num1,num2,result;
        System.out.println("Choose an operator: +, -, *, or /");
        Operator= calculator.next().charAt(0);
        System.out.println("Enter first number");
        num1 = calculator.nextDouble();
        System.out.println("Enter second number");
        num2 = calculator.nextDouble();
       switch (Operator)
       {
           case '+':
               result = num1 + num2;
               System.out.println(num1 + " + " + num2 + " = " + result);
               break;
           case '-':
               result = num1 - num2;
               System.out.println(num1 + " + " + num2 + " = " + result);
               break;
           case '*':
               result = num1 * num2;
               System.out.println(num1 + " + " + num2 + " = " + result);
               break;
           case '/':
               result = num1 / num2;
               System.out.println(num1 + " + " + num2 + " = " + result);
               break;

       }
    }
}
