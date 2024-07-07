package multithreading.interThreading.Banking;
class DepositRunnable implements Runnable {
    private final BankAccount account;
    private final int amount;

    public DepositRunnable(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        try {
            while (true) {
                account.deposit(amount);
                Thread.sleep((int) (Math.random() * 1000));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}


