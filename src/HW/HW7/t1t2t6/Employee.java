package HW.HW7.t1t2t6;

public class Employee {

    public Employee(int baseSalary, String name, int salary) {
        this.baseSalary = baseSalary;
        this.name = name;
        this.salary = salary;
    }

    private int baseSalary;
    private String name;
    private int salary;

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

}
