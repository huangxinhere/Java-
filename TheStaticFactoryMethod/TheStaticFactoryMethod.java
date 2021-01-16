package TheStaticFactoryMethod;

public class TheStaticFactoryMethod {
    public static void main(String[] args){
        Child child = Child.newChild(11,"Tom");
        Child ageOfChild = Child.newChildAge(18);
        Child nameOfChild = Child.newChildName("Tom");
    }

}
//可以有多个参数相同但名称不同的工厂方法
class Child{
    public int age;
    public String name;

    public static Child newChild(int age,String name){
        Child child = new Child();
        child.age = age;
        child.name = name;
        return child;
    }

    public static Child newChildName(String name){
        Child child = new Child();
        child.name = name;
        return child;
    }

    public static Child newChildAge(int age){
        Child child = new Child();
        child.age = age;
        return child;
    }
}
