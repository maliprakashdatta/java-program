package multithreading.Thread.Vehical;

public abstract class Vehicle extends Thread
{
    private String name;
    private int speed; // Speed in milliseconds (lower value means faster)

    public Vehicle(String name, int speed) {
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
}
