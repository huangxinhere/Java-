package Classes;

import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>{
    private double salary;
    private LocalDate hireDay;

    public Employee(String name,double salary,int year,int month,int day){
        super(name);
        this.salary =salary;
        hireDay = LocalDate.of(year,month,day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f",salary);
    }

    public void raiseSalary(double byPercent){
        double raise = salary*byPercent/100;
        salary+=raise;
    }

    public int hashCode(){
        return Objects.hash(getName(),salary,hireDay);
        //return 7*Objects.hashCode(name)+...
    }
    @Override
    public String toString(){
        return super.toString()
                +"[hireDay=" + hireDay
                +",salary=" + salary + "]";
    }

    public boolean equals(Object otherObject){
        // a quick test to see if the objects are identical
        if (this == otherObject) return true;

        // must return false if the explicit parameter is null
        if (otherObject == null) return false;

        // if the classes don't match, they can 't be equal
        if (getClass()!= otherObject.getClass()) return false;

        // now we know otherObject is a non-null Employee
        Employee other = (Employee) otherObject;

        // test whether the fields have identical values
        return  salary == other.salary
                && Objects.equals(hireDay, other.hireDay);
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(salary,other.getSalary());
    }
}
