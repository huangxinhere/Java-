package Inheritance;

public class ManagerTest {
    public static void main(String[] args)
    {
        Manager boss=new Manager("Tom",20000,2020,11,16,5000);

        Employee[] staff=new Employee[3];

        staff[0]=boss;//子类的对象可放进父类类型的数组中
        staff[1]=new Employee("Amy",10000,2009,1,1);
        staff[2]=new Employee("Tom",5000,1997,12,20);//不要忘记构造

        for(Employee e:staff)//（类型 变量/不用定义类型：数组名）
            System.out.println("name="+e.getName()+",salary="+e.getsalary()+",date="+ e.getHireDay());


    }
}
