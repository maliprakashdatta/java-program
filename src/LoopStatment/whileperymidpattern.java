package LoopStatment;

public class whileperymidpattern
{
    public static void main(String[] args)
    {
        int i,j,n=5,k;
        i=1;
        while (i<=n)
        {
            k= 1;
            while (k <= n - i)
            {
                System.out.println(" ");
                k++;
            }
            j=1;
            while (j<=2*i-1)
            {
                System.out.println(j+" ");
                j++;
            }
            System.out.println();
            i++;

        }
    }
}
