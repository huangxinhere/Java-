public abstract class Role {
    protected String name;//此处protected子类可以访问超类中的实例域
    protected int age;
    protected String gender;

    public Role(){}//空的构造器，无参构造函dao数的好处在于, 调用该构造器zhi,会用默dao认值去初始化成员.
    //.因为只要创建了有参数的,就只能用有参数的构造函数,而不能用空参数的,所以要创显式创建一个空参数的构造函数.
    public Role(String n,int a,String g)
    {
        this.name=n;
        this.age=a;
        this.gender=g;
    }

    public String getName()
    {
        return name;
    }
    public void setName()//中间若不是void就会要求返回
    {
        this.name=name;
    }

    public abstract void play();//抽象方法公有,可能可以被其他类（非子类）访问

    public static void main(String[] args)
    {
        Employee e=new Employee();
        e.name="xiaoming";
        e.gender="male";
        e.age=18;
        e.id=123;
        e.salary=100;
        e.play();
        e.sing();//以上是子类确定属性和调用方法
        Manager m=new Manager();
        System.out.println(e.id);
        System.out.println(e.salary);
        System.out.println(e.name);
        System.out.println(e.age);
        System.out.println(e.gender);
        System.out.println(m.vehicle);
    }
}

class Employee extends Role//There is no default constructor available in 'Role'没有super
{
    protected int salary;//只能被它的再一继承使用
    protected static int id;

    public Employee(){}
    private Employee(String n,int a,int s,String g,int id)
    {//上句中间加了个void，被说是要把super放在首位？？
        super(n,a,g);//
        this.salary=s;
        this.id=id;

    }
    public void play()
    {
        System.out.println("name: "+name+"age: "+age+"id:"+id+"salary"+salary);
    }
    public final void sing()
    {
        System.out.println("I can sing");
    }


}
class Manager extends Employee
{
    final protected String vehicle="baoma";//刚开始没有被初始化，，因为最后？要，直接初始化？

}
