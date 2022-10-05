package HW.HW_5_6;

public class Employee {

    private String name;
    private int age;
    private String sex;
    private int yearOfBirth;
    private int salary;

    public boolean isSameName(Employee employee){
        return employee.name.equals(this.name);
    }


}
