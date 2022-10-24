package HW.HW7;

public final class Director extends Manager {

    private static final int ADD = 9;


    public Director(String name, int age, String sex, int baseSalary, int salaryPerDay, int numberOfSubordinates) {
        super(name, age, sex, baseSalary, salaryPerDay, numberOfSubordinates);
    }

    @Override
    public int getSalary() {
        return (super.getBaseSalary() * (100 + getNumberOfSubordinates() * Director.ADD)) / 100;
    }
}
