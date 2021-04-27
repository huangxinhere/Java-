package Errors;

import java.awt.*;

public class ExcepTest {

    public static void main(String args[]){
        int[] a = new int[2];
        try{
            System.out.println("Access element three :" + a[3]);
            //java内置异常类，下面那个属于非检查性异常————用它的对象，打印出异常
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown :" + e);
        }
        finally {
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed.");
        }
    }
}
/*
* catch不能独立于try存在
* finally非强制性要求
* try后面不能没有catch也没finally
* 三者之间不能没有任何代码*/
