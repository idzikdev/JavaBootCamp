package Threads.BankAccount;

public class AccountIncrementator implements Runnable{

    private Account account;

    public AccountIncrementator(Account account) {
        this.account=account;
    }

    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            account.increase();
            //System.out.println(i);
        }
    }
}
