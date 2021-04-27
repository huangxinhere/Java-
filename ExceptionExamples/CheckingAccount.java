package ExceptionExamples;
import  java.io.*;

//模拟银行账户
public class CheckingAccount {
    //余额
    private double balance;
    private int number;

    public CheckingAccount(int number){
        this.number = number;
    }
//方法：存钱
    public void deposit(double amount){
        balance += amount;
    }
//方法：取钱
    public void withdraw(double amount) throws InsufficientFundsException//在错误可能出现的方法内抛出异常
    {
        if(amount <= balance){
            balance -= amount;
        }else{
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

    public double getBalance(){
        return balance;
    }

    public int getNumber(){
        return number;
    }
}
