package practice2;

public class WuMingFen {
    private String theMa;
    private int quantity;
    private boolean likesoup;

    public WuMingFen(String s,int i,boolean b)
    {
        this.theMa=s;
        this.quantity=i;
        this.likesoup=b;
        if (b==true)
        {
            String b1="带汤的";
            System.out.println("面码："+theMa+"\n量："+quantity+"\n"+b1);
        }
    }
    public WuMingFen(String s,int i)
    {
        this.theMa=s;
        this.quantity=i;//.重载构造方法 使得初始化过程可以多样化
    }

    public void check()//使得下列语句构造出来的粉对象是酸辣面码、2两、带汤的 WuMingFen f3 = new WuMingFen();
    {
        if (likesoup==true)
        {
            String b1="带汤的";
            System.out.println("面码："+theMa+"\n分量"+quantity+"\n"+b1);
        }
        else
        {
            String b1="不带汤的";
            System.out.println("面码："+theMa+"\n分量"+quantity+"\n"+b1);
        }
    }

    public static void main(String[] args)
    {
        WuMingFen a=new WuMingFen("热干面",3,false);//
        a.check();//简化后，必须有check方法来判断是否带汤并输出；如果没有check，如何确定面是否带汤的属性？
        WuMingFen b=new WuMingFen("鱼香肉丝面",5,true);
    }

}
