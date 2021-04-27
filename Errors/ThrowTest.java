package Errors;

import java.rmi.RemoteException;

public class ThrowTest {

    //如果一个方法没有捕获到一个检查性异常，该方法必须使用throws关键字来声明
    //1.放在方法签名的尾部
    public void deposit(double amount) throws RemoteException{
        //2.抛出异常，新实例化或者刚捕获到的
        throw new RemoteException();
    }
}
