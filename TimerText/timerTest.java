package TimerText;

import javax.swing.*;
import java.awt.event.ActionListener;

public class timerTest {
    public static void main(String[] args){
        //监听器
        ActionListener listener = new TimePrinter();

        // construct a timer that calls the listener
        //once every 10 seconds
        //定时器
        //一到时间通知做什么动作：创建实现接口的类的对象，并自动调用相应的方法
        Timer t = new Timer(10000,listener);
        t.start();
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}
