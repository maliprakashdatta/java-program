package multithreading.Thread.Vehical;
//
//public class Main {
//}
public class Main {
    public static void main(String[] args) {
        // Create vehicle threads
        Vehicle car = new Car("Car", 1000);
        Vehicle bike = new Bike("Bike", 800);
        Vehicle truck = new Truck("Truck", 1200);

        // Start vehicle threads
        car.start();
        bike.start();
        truck.start();

        try {
            car.join();
            bike.join();
            truck.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All vehicles have finished their journeys.");
    }
}

