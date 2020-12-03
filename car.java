public class car {
    private int lunzi;
    private String colour;
    private double weight;

    public car(int l,String c,double w)
    {
        this.lunzi=l;
        this.colour=c;
        this.weight=w;
    }

    public void SpeedUp()//通过不同的构造方法创建事例
    {
        System.out.println("Speed up!");
    }
    public void SpeedDown()
    {
        System.out.println("Speed down!");
    }
    public void Stop()
    {
        System.out.println("Stop!");
    }

    public static void main(String[] args)
    {
        car c=new car(5,"green",55);
        c.SpeedUp();
        c.SpeedDown();
        c.Stop();
    }
}
