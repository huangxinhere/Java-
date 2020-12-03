
public class interfaceVehicle {
    public static void main(String[] args) {
        Bike bike = new Bike();//cannot be referenced from a static contextmain方法是一个static方法，class Bike是一个非静态的内部类，只能被该类的非静态方法访问
        bike.start();
        bike.stop();
        Bus bus = new Bus();
        bus.start();
        bus.stop();
    }
}//少了个括号，产生”进行语法分析时已到达文件结尾“的问题和静态内部类的问题

    interface Vvehicle//为什么被看作类?
{
    public void start();
    public void stop();//创建一个接口。方法直接是方法名
}

 class Bike implements Vvehicle//在类中实现接口，除了接接口其余一样
{
    public void start()
    {
        System.out.println("I am a bike,I am running.");
    }
    public void stop()
    {
        System.out.println("I am a bike,I stop.");
    }
}
 class Bus implements Vvehicle
{
    public void start()
    {
        System.out.println("I am a bus,I am running.");
    }
    public void stop()
    {
        System.out.println("I am a bus,I stop.");
    }
}
