package Classes;

public class personTest {
    public static void main(String[] args){
        //抽象类变量可引用子类的对象
        Person[] people = new Person[2];

        people[0] = new Employee("harry",50000,1989,10,1);
        people[1] = new Student("Sam","Computer");
        //抽象方法自动调用相对应的实现方法
        for (Person p:people){
            System.out.println(p.getName()+","+p.getDescription());
        }
    }
}
