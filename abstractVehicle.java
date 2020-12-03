public class abstractVehicle {
//无属性的对象不用实例域，直接用方法也可
    public static void main(String[] args)
    {
        Car c=new Car();
        c.NoOfWheels();//不同类的同种方法自动区分?
        Motorbike m=new Motorbike();
        m.NoOfWheels();
    }
}
abstract class Vehicle//另创一个抽象类，而不是子类，弄清含义
{
    public void NoOfWheels(){}//空的方法，抽象超类中也含和子类同样的方法
}
class Car extends Vehicle//超类中含子类（static class a extends b），超类外定子类
{//若写成car会报错，因为同包另外的类里面也声明有car
    public void NoOfWheels()
    {
        System.out.println("四轮车");
    }
}
class Motorbike extends Vehicle//如果打错类的名字，会说明没有“……”的构造器
{
    public void NoOfWheels()
    {
        System.out.println("二轮车");
    }
}