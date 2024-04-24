package LoopStatment;

public class whilepattern {
    public static void main(String[] args)
    {
        int rows=5,i=1,j=1;
        while (i<=rows)
        {

            while (j<=i)
            {
                System.out.println("*\t");
                j++;

            }
            System.out.println("\n");
            j=1;
            i++;
            System.out.println();
        }
    }
}
