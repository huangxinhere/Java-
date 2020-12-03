 interface Imen{//如果类A被声明为公共的（public），那么必须将类A保存在名为A.java的文件中
    //一个文件中最多只能有一个类是public的，这样可以暴露类的定义，
    //方便其他类来访问！ 如果已经有了这个公共的类  那么这个文件名必须和类名相同！
    public void threfproof();
    public void waterproof();
    public void fireproof();
    public void bulletproof();
    public void rustproof();
}

public class aCoolDoor {//此程序好像就是功能的实现
    public static void main(String[] args)
    {
        men m=new men();
        m.opendoor();
        m.closedoor();//关于对象对方法的调用：
    }

}

abstract class Door
{
   public void opendoor(){};//抽象方法不能有主体（没有实际内容）{}也会被认为为有内容
    public void closedoor(){};// public void closedoor();
}
class men extends Door implements Imen//继承抽象超类加接口
{
    public void opendoor()
    {
        System.out.println("I am opening the door.");
    }
    public void closedoor()
    {
        System.out.println("I am closing the door.");
    }
    public void threfproof()
    {
        System.out.println("i can threfproof");
    }
    public void waterproof()
    {
        System.out.println("i can waterproof");
    }
    public void fireproof()
    {
        System.out.println("i can fireproof");
    }
    public void bulletproof()
    {
        System.out.println("i can bulletproof");
    }
    public void rustproof()
    {
        System.out.println("i can rustproof");
    }
}
