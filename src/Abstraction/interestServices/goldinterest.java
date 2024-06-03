package Abstraction.interestServices;

public class goldinterest extends mainservices {

    int goldprice=70000;
    float interestrate=6;
    int rate;

    public void setGoldprice(int goldprice) {
        this.goldprice = goldprice;
    }
    public int getGoldprice() {
        return goldprice;
    }

    public void setInterestrate(float interestrate) {
        this.interestrate = interestrate;
    }

    public float getInterestrate() {
        return interestrate;
    }
    // We can change values here for
    // different inputs
//    float goldPrice = 10000,  interest= 6, month = 5;
//    // Calculate simple interest
//    float SI = (goldPrice* interest * month) / 100;
//    {
//        System.out.println("Simple interest = " + SI);
//    }


}
