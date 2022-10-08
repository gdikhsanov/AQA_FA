package HW.HW_5_6;

import org.hamcrest.core.IsNull;

public class Employee extends Person {

    private int salary;

    public Employee(String name, int yearOfBirth, String sex, int salary) {
        super(name, yearOfBirth, sex);
        this.salary = salary;
    }

    public boolean isSameName(Employee employee) {
        if (this.name == null || employee.name == null) {

            return false;
        }
        return employee.name.equals(this.name);
    }

    public int getSalary() {
        return salary;
    }

    @Override // to print user card in list
    public String toString() {
        return String.format("%-15s %-5d %-5s %-10d", this.getName(), this.getAge(), this.getSex(),
                this.getSalary()) ;
    }
}
