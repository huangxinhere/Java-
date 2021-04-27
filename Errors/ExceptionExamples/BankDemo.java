package Errors.ExceptionExamples;

/*
* 首先，取钱方法（withdraw）声明throw异常，因为可能出错
* 在那个方法里面整理好错误的信息new一个异常类对象，带上错误信息，然后throw出去
* 异常类对象被throw到catch语句块，在块里面取出对象的信息，打印出来
* */

import java.util.logging.Level;
import java.util.logging.Logger;

public class BankDemo {
    public static void main(String[] args)
    {
        //取消所有日志:它后面的执行代码中的logger才会被取消
        //Logger.getGlobal().setLevel(Level.OFF);
        //全局日志记录器
        Logger.getGlobal().info("I am a logger test...");

        CheckingAccount c = new CheckingAccount(101);
        System.out.println("Depositing $500...");
        c.deposit(500.00);

        try {
            System.out.println("\nWithdrawing $100...");
            c.withdraw(100.00);
            System.out.println("\nWithdrawing $600...");
            c.withdraw(600.00);
        }catch (InsufficientFundsException e){
            System.out.println("Sorry,but you are short $" + e.getAmount());
            e.getStackTrace();
        }
    }
}
