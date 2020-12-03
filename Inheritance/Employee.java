package Inheritance;

import java.time.*;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n,double s,int year,int month,int day)
    {
        this.name=n;
        this.salary=s;
        this.hireDay=LocalDate.of(year,month,day);
    }
    public String getName()
    {
        return name;
    }
    public double getsalary()
    {
        return salary;
    }
    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary( double byPercent)//易漏声明类型，下double同
    {
        double raise=salary*byPercent/100;
        salary+=raise;
    }
}
