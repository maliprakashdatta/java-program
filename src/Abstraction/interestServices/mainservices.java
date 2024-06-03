package Abstraction.interestServices;

public class mainservices {
    public static void main(String[] args) {
       goldinterest goldinterest=new goldinterest();
        goldinterest.setGoldprice(70000);
        goldinterest.setInterestrate(6);
        System.out.println("GOld price:-"+goldinterest.getGoldprice());
        System.out.println("Interest Rate for Month:-"+goldinterest.getInterestrate());
        System.out.println("------------------------------");

        float goldPrice = 10000,  Interestrate= 6, month = 12;
        // Calculate simple interest
        float rate = (goldPrice* Interestrate * month) / 100;
        {
            System.out.println("Total Year of  interest Rate Is= " +rate);

        }
        System.out.println("----------------------------------");
        float  oneMonth = 1;
        // Calculate simple interest
        float MonthRate= (goldPrice* Interestrate * oneMonth) / 100;
        {
            System.out.println(" Month of Interest rate:-"+MonthRate);
        }


//        // We can change values here for
//        // different inputs
//        float P = 10000, R = 5, T = 5;
//        // Calculate simple interest
//        float SI = (P * T * R) / 100;
//        System.out.println("Simple interest = " + SI);

    }

}
