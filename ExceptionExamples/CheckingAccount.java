package ExceptionExamples;
import  java.io.*;

public class CheckingAccount {
    private double balance;
    private int number;
    public CheckingAccount(int number){
        this.number = number;
        //为什么不构造balance的实例？
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount)throws InsufficientFundsException//在错误可能出现的方法内抛出异常
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
