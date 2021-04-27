package Errors.ExceptionExamples;

/*
* 所有异常都必须是 Throwable 的子类
* 检查性异常类----需要继承 Exception 类;只继承Exception 类来创建的异常类是检查性异常类
* 运行时异常类----继承 RuntimeException 类
* */

//自定义异常类，普通的成员变量加方法
public class InsufficientFundsException extends Exception{
    //此处的amount用来储存当出现异常（取出钱多于余额时）所缺乏的钱
    private double amount;

    public InsufficientFundsException(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }
}
