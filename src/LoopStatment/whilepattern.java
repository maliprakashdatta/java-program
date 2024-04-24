package LoopStatment;

public class whilepattern
{
    public static void main(String[] args)
    {
        int rows=5,i=1,j=1;
        while (i<=rows)
        {
             j=1;
            while (j<=i)
            {
                System.out.println(j+" ");
                j++;

            }
            System.out.println("\n");
            i++;

        }
    }
}
