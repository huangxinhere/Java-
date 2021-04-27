package Errors.ExceptionExamples;

import java.util.logging.Level;
import java.util.logging.Logger;

//模拟银行账户
public class CheckingAccount {
    //余额
    private double balance;
    private int number;
/*创建或获取记录器*/
    private static final Logger myLogger = Logger.getLogger("BandDemo");
    private String message;


    public CheckingAccount(int number){
        this.number = number;
    }
//方法：存钱
    public void deposit(double amount){
        balance += amount;
        //为学习log随便放
        //myLogger.setLevel(Level.FINE);//FINE 和更高级别的记录都可以记录下来
       // myLogger.warning(message);
       // myLogger.log(Level.FINE,message);//使用Log方法指定级别
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
