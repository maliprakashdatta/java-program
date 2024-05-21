import java.util.*;
class Car
{
    int id;
    String name;
    float price;
    public Car(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class testcar {
    public static void main(String[] args) {
        List<Car> productsList = new ArrayList<Car>();
        //Adding Car Details
        productsList.add(new Car(1, "Tata Zest", 25000f));
        System.out.println("Car Details:- "+productsList);
    }
}
