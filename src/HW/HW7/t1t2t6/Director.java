package HW.HW7.t1t2t6;

public class Director extends Employee {

    private int numberOfSubordinates;

    public Director(int baseSalary, String name, int salary, int numberOfSubordinates) {
        super(baseSalary, name, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary() {
        return (super.getBaseSalary() * (100 + getNumberOfSubordinates() * 3)) / 100;
    }
}
