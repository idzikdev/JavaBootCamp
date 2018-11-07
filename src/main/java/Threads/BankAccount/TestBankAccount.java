package Threads.BankAccount;

import Threads.RunnableWay2;

public class TestBankAccount {
    public static void main(String[] args) {
        Account account=new Account();
        AccountIncrementator accountIncrementator1=new AccountIncrementator(account);
        Thread thread1=new Thread(accountIncrementator1);
        AccountIncrementator accountIncrementator2=new AccountIncrementator(account);
        Thread thread2=new Thread(accountIncrementator2);
        thread1.start();
        thread2.start();
        try {
            thread1.join(); //bo inaczej wątek główny nie poczeka
            thread1.join(); //i wyświetli value zanim wątki zakończą pracę
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(account.getValue());
    }
}
