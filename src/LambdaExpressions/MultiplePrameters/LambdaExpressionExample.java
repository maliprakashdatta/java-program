package LambdaExpressions.MultiplePrameters;

public class LambdaExpressionExample {
    public static void main(String[] args) {
    //to add a value
        //Multiple parameters in lambda expression
        Addable sum=(a,b)->(a+b);
        System.out.println("To add Value:-"+sum.add(10,20));

    }
}
