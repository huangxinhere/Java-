public class StaticDemo {//Static关键字与普通变量的区别
    private static int i=10;
    private int y=5;
    public static void main(String[] args)
    {
        StaticDemo s=new StaticDemo();
        System.out.println("The static digit is "+i+"\n and the normal digit is "+s.y);//对象。变量是个啥
    }
}
