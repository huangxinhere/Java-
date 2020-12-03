package Inheritance;

public class Manager extends Employee {
    private double bonus;

    public Manager(String n,double s,int year,int month,int day,double b)//构造了才不会出现There is no default constructor available in 'Inheritance.Employee'错误
    {
        super(n,s,year,month,day);
        this.bonus=b;//
    }
    public double getSalary()//覆盖方法
    {
        double baseSalary=super.getsalary();//可以先super调用父类的方法来为子类变量赋值
        return baseSalary+bonus;//返回一个值
    }
    public double setBonus()
    {
        return bonus;
    }
}
