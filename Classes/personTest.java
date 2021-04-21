package Classes;

import java.util.Arrays;

public class personTest {
    public static void main(String[] args){
        //抽象类变量可引用子类的对象
        Person[] people = new Person[3];

        people[0] = new Employee("harry",50000,1989,10,1);
        //people[1] = new Student("Sam","Computer");
        people[1] = new Employee("hehe",4500,1999,11,21);
        people[2] = new Employee("Daming",75000,1987,12,15);
        Employee c = (Employee) people[0];
        //抽象方法自动调用相对应的实现方法
        for (Person p:people){
            System.out.println(p.getName()+","+p.getDescription());
        }

        //hashCode
        String s = "OK";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(s.hashCode()+" "+sb.hashCode());
        String t = "OK";
        StringBuilder tb = new StringBuilder(s);
        System.out.println(t.hashCode()+" "+tb.hashCode());

        System.out.println(people[0].hashCode());
        //toString
        System.out.println(people[0]);
        //equals
        System.out.println("c==people[0]:"+(people[0]==c));
        System.out.println("people[2]==people[0]:"+(people[0]==people[2]));
        //interface:compare
        Arrays.sort(people);
        for (Person e:people)
            System.out.println("name="+e.getName()+",salary="+e.getSalary());

    }
}
