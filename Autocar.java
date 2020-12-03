public class Autocar {
    public int luntai;
    public String colour;
    public int speed;
    public Autocar(){}//空的构造器??

    public void slowDown()
    {
        System.out.println("Slow down!");
    }

    public void speedUp()
    {
        System.out.println("Speed up!");
    }
    public void stop()
    {
        System.out.println("Stop!");
    }

    public static void main(String[] args)
    {
        car c=new car();
        c.slowDown();
        c.speedUp();
    }

   static class car extends Autocar
    {
        public String air_conditon;
        public String CD;

        public void speedUp()//覆盖方法,直接引用
        {
            System.out.println("hey,Speed up!");
        }
        public void slowDown()
        {
            System.out.println("wow,Slow down!");
        }
    }


}
