public class HanShu {//以下是构造函数*与构造器，方法有什么不同？函数直接是对象加类（方法）输出
//和c差不多，类似方法（如果可以这么认为）会接受参数；方法就不会了吗？？
    public HanShu(int x,int y)//传递两个整数值并找出其中较大的一个值
    {
        if (x>y)
        {
            System.out.println("The max is "+x);
        }
        else
            System.out.println("The max is "+y);
    }

    public HanShu(double d1,double d2,double d3)//传递三个double值并求出其乘积
    {
        double ji=d1*d2*d3;
        System.out.println("The multiply is "+ji);
    }

    public HanShu(String s1,String s2)//传递两个字符串值并检查其是否相同
    {
        boolean b;//布尔值也用变量
        if (s1.equals(s2))
        {
            b=true;
            System.out.println(b);
        }
        else
        {
            b=false;
            System.out.println(b);
        }
    }

    public static void main(String[] args)
    {
        HanShu a=new HanShu(1,5);//自动检索对应方法
        HanShu b=new HanShu(5,6,7);
        HanShu c=new HanShu("wahaha","wahaha");
    }
}
