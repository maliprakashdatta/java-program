package multithreading.interThreading.Banking;
class WithdrawRunnable implements Runnable {
    private final BankAccount account;
    private final int amount;

    public WithdrawRunnable(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        try {
            while (true) {
                account.withdraw(amount);
                Thread.sleep((int) (Math.random() * 1000));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

