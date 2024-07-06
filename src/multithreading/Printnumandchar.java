package multithreading;
class PrintNumbers extends Thread {
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

class PrintLetters extends Thread {
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

public class Printnumandchar {
    public static void main(String[] args) {
        PrintNumbers thread1 = new PrintNumbers();
        PrintLetters thread2 = new PrintLetters();

        thread1.start();
        thread2.start();
    }
}
