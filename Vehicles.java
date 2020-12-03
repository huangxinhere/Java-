public class Vehicles {
    public String brand;
    public String color;

    public void run()
    {
        System.out.println("I am running!");//run方法
    }

    public Vehicles(String b,String c)//对象属性
    {
        this.brand=b;
        this.color=c;
    }

    public void showInfo()//父类展示方法
    {
        System.out.println("brand:"+this.brand+"\ncolor:"+this.color);
    }

    public static void main(String[] args)
    {
        Vehicles bz=new Vehicles("bigbengchi","white");
        bz.showInfo();

        car c=new car("baoma","black",4);
        c.showCar();

        Truck d=new Truck("laosilaisi","pink",15);
        d.showTruck();
    }


   static class car extends Vehicles//若没有static ，则是非静态的内部类，只能被这个类的非静态方法访问。main时静态方法，使用该类创建对象时会出错。
    {
        public int seat;//
        public void showCar()//
        {
            System.out.println("I am a "+this.brand+",my colour is "+this.color+",I have "+this.seat+"seats");
        }
        public car(String b,String c,int s)//
        {
            super(b,c);//
            this.seat=s;
        }
    }

   static class Truck extends Vehicles
    {
        public float load;

        public void showTruck()
        {
            System.out.println("I am a "+this.brand+",my colour is "+this.color+",I can stand "+this.load);
        }

        public Truck(String b,String c,float f)
        {
            super(b,c);
            this.load=f;
        }
    }
}
