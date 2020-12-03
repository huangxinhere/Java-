public class Penson {
    private String name;
    private int age;//实例域

    public Penson(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void display()//方法
    {
        System.out.println("name:"+name+"\tage:"+age);
    }
    public static void main(String[] args)//运用类造对象，再用方法
    {
        Penson John=new Penson("John",18);//一个对象变量，类中含两个属性
        John.display();//方法
    }
}
