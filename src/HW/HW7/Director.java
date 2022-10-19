package HW.HW7;

public class Director extends Manager {

    public Director(String name, int age, String sex, int baseSalary, int salaryPerDay, int numberOfSubordinates) {
        super(name, age, sex, baseSalary, salaryPerDay, numberOfSubordinates);
    }

    @Override
    public int getSalary() {
        return (super.getBaseSalary() * (100 + getNumberOfSubordinates() * 9)) / 100;
    }
}
