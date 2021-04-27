/*
* 删去断言的那部分语句后，你程序的结构和运行不应该有任何改变，
* 千万不要把断言当成程序中的一个功能来使用
*
* assert条件;
* assert条件:表达式;
* 这两种形式都会对条件进行检测， 如果结果为 false, 则抛出一个 AssertionError 异常。
在第二种形式中，表达式将被传人 AssertionError 的构造器， 并转换成一个消息字符串
*
* 需要启用/禁用断言
* */
public class AssertionDemo {
    static int i = 5;
    public static void main(String[] args){
        assert i==6;
        System.out.println("如果断言正常，我就被打印");

        int i = 3;
        switch (i){
            case 1:
            case 3:
            case 5:
                System.out.println("正常");break;
            default:
                assert false:"i的值无效";//如果i的值不是你想要的，程序就警告退出
        }
        System.out.println("如果断言正常，我就被打印");
    }
}

