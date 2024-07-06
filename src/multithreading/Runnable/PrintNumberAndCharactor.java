package multithreading.Runnable;

class PrintNumbers implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class PrintLetters implements Runnable {
    public void run() {
        for (char letter = 'a'; letter <= 'e'; letter++) {
            System.out.println("Letter: " + letter);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class PrintNumberAndCharactor
{
    public static void main(String[] args) {
        Thread thread1 = new Thread(new PrintNumbers());
        Thread thread2 = new Thread(new PrintLetters());

        thread1.start();
        thread2.start();
    }
}
