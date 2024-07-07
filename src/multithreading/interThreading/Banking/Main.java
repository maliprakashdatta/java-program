package multithreading.interThreading.Banking;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread depositThread = new Thread(new DepositRunnable(account, 100));
        Thread withdrawThread = new Thread(new WithdrawRunnable(account, 50));

        depositThread.start();
        withdrawThread.start();
    }
}

