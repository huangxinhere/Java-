package practice2 ;

public class addition {
    public void additionInt(int x,int y)
    {
        int sum=x+y;
        System.out.println("sum="+sum);
    }
    public void additionlong(long x,long y)
    {
        long sum=x+y;
        System.out.println("sum="+sum);
    }
    public void additionFloat(float x,float y)
    {
        float sum=x+y;
        System.out.println("sum="+sum);
    }
    public void additionDouble(double x,double y)
    {
        double sum=x+y;
        System.out.println("sum="+sum);
    }
    public void additionString(String x,String y)
    {
        String sum=x+y;
        System.out.println("sum="+sum);
    }

    public static void main(String[] args)//在main方法中创建Addition类的实例 分别调用重载方法测试其效果
    {
        addition num=new addition();//构造对象，不一定写属性
        num.additionInt(2,5);//方法对应再填属性
        num.additionString("6","7");
    }

}
