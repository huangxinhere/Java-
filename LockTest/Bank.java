package LockTest;

/*
* 模拟一个银行，财产总数固定，拥有很多个账户，账户之间进行转账
*/

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    private final double[] accounts;
    private Lock bankLock;
    private Condition sufficientFunds;

    /*
    * @param n : the number of accounts
    * @param initialBalance : the initial balance for each account
    * */
    public Bank(int n,double initialBalance){
        accounts = new double[n];
        Arrays.fill(accounts,initialBalance);
        bankLock = new ReentrantLock();
        sufficientFunds = bankLock.newCondition();
    }

    public void transfer(int from, int to ,double amount) throws InterruptedException
    {
        bankLock.lock();
        try
        {
            //余额不足,条件对象,使🔒暂时失效
            while (accounts[from] < amount)
                sufficientFunds.await();

            System.out.println(Thread.currentThread());
            //转账操作
            accounts[from] -= amount;
            System.out.printf(" %10.2f from %d to %d",amount,from,to);
            accounts[to] += amount;
            System.out.printf(" Total Balance: %10.2f%n",getTotalBalance());
            //转账成功,解除条件对象造成的阻塞
            sufficientFunds.signalAll();
        }
        finally {
            bankLock.unlock();
        }
    }

    public double getTotalBalance(){
        bankLock.lock();
        try
        {
            double sum = 0;
            for (double a : accounts)
                sum += a;
            return sum;
        }
        finally {
            bankLock.unlock();
        }
    }

    public int size(){
        return accounts.length;
    }
}
