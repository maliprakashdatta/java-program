import java.util.Scanner;

public class Substrationpc
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter sub1 value:-");
        int sub1=scanner.nextInt();
        System.out.println("Enter sub2 value:-");
        int sub2=scanner.nextInt();
        int sub3;
        sub3=sub1-sub2;
        System.out.println("Value of sub3:-"+sub3);
    }
}
