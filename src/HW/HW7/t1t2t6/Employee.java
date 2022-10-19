package HW.HW7.t1t2t6;

public class Employee {

    private String name;
    private int age;
    private String sex;
    private int baseSalary;
    private int salary;
    private int salaryPerDay;

    public Employee(String name, int age, String sex, int baseSalary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.baseSalary = baseSalary;
    }

    public Employee(String name, int age, String sex, int baseSalary, int salaryPerDay) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.baseSalary = baseSalary;
        this.salaryPerDay = salaryPerDay;
    }

    public Employee(String name, int age, String sex, int baseSalary, int salary, int salaryPerDay) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.baseSalary = baseSalary;
        this.salary = salary;
        this.salaryPerDay = salaryPerDay;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(int salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public int getSalary() {
        return salary;
    }





}
