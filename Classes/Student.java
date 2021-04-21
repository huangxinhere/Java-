package Classes;

public class Student extends Person{
    private String major;

    public Student(String n,String major) {
        super(n);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in "+major;
    }

    @Override
    public double getSalary() {
        return 0;
    }
}
