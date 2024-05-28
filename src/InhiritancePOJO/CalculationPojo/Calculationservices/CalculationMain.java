//Please implement the below POJO classes with the help of inheritance:
//- Calculation, Addition, Subtraction, Multiplication, Division
package InhiritancePOJO.CalculationPojo.Calculationservices;
//import InhiritancePOJO.CalculationPojo.Calculationmodel.Addition;
//import InhiritancePOJO.CalculationPojo.Calculationmodel.Subtraction;
//import InhiritancePOJO.CalculationPojo.Calculationmodel.Multiplication;
//import InhiritancePOJO.CalculationPojo.Calculationmodel.Division;
import java.util.Scanner;

     public class CalculationMain {
    public static void main(String[] args) {


        System.out.println("----------Addition-------------");
        System.out.println("Please enter Addvalue1:-");
        Scanner add1 = new Scanner(System.in);
        int addvalue1 = add1.nextInt();

        System.out.println("Please enter  Addvalue2:-");
        Scanner add2 = new Scanner(System.in);
        int addvalue2= add2.nextInt();

        int add=addvalue1+addvalue2;
        System.out.println("Total Sum:-"+add);
        System.out.println("======================================");

        System.out.println("-------------Substration--------------");
        System.out.println("Please enter Subvalue1 :-");
        Scanner Sub1=new Scanner(System.in);
        int Subvalue1=Sub1.nextInt();

        System.out.println("Please enter Subvalue2:-");
        Scanner Sub2=new Scanner(System.in);
        int Subvalue2=Sub2.nextInt();

        int sub=Subvalue1-Subvalue2;
        System.out.println("Substration Value is:-"+sub);
        System.out.println("=======================================");

        System.out.println("-------------Multification--------------");
        System.out.println("Please enter Multivalue1 :-");
        Scanner Multi1=new Scanner(System.in);
        int Multivalue1=Multi1.nextInt();

        System.out.println("Please enter Multivalue2:-");
        Scanner Multi2=new Scanner(System.in);
        int Multivalue2=Multi2.nextInt();

        int Multi=Multivalue1*Multivalue2;
        System.out.println("Multification Value is:-"+Multi);

        System.out.println("=============================================");
        System.out.println("------------Division------------------------");
        System.out.println("Please enter Divisionvalue1 :-");
        Scanner Division1=new Scanner(System.in);
        int Divisionvalue1=Division1.nextInt();

        System.out.println("Please enter Divisionvalue2 :-");
        Scanner Division2=new Scanner(System.in);
        int Divisionvalue2=Division2.nextInt();

        int Division=Divisionvalue1/Divisionvalue2;
        System.out.println("Division Value is:-"+Division);
        System.out.println("---Thanks for Using my Calculation Program-- ");











    }
}
