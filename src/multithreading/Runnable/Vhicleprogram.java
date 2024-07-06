package multithreading.Runnable;

public class Vhicleprogram implements Runnable {
    private String name;
    private int speed; // Speed in milliseconds (lower value means faster)

    public Vhicleprogram(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " is running, step " + (i + 1));
            try {
                Thread.sleep(speed);
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted.");
            }
        }
        System.out.println(name + " has finished its journey.");
    }

    public static void main(String[] args) {
        // Create vehicle threads
        Thread car = new Thread(new Vhicleprogram("Car", 1000));
        Thread bike = new Thread(new Vhicleprogram("Bike", 800));
        Thread truck = new Thread(new Vhicleprogram("Truck", 1200));

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

