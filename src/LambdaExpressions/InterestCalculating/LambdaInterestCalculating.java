package LambdaExpressions.InterestCalculating;

import LambdaExpressions.MultiplePrameters.Addable;

public class LambdaInterestCalculating {
    public static void main(String[] args) {

        interest cal=(basicamt, interest)-> (int) (basicamt*(interest/100));
        System.out.println("To add Value:-"+cal.calculating(50000, 6.4f));

    }
}
