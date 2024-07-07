package multithreading.interThreading.Banking;
class BankAccount {
    private int balance = 0;

    public synchronized void deposit(int amount) throws InterruptedException {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
        notifyAll();
    }

    public synchronized void withdraw(int amount) throws InterruptedException {
        while (balance < amount) {
            System.out.println("Waiting to withdraw " + amount + ", Balance: " + balance);
            wait();
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount + ", Balance: " + balance);
    }

    public synchronized int getBalance() {
        return balance;
    }
}

