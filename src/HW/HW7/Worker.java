package HW.HW7;

public final class Worker extends Employee{

    public Worker(String name, int age, String sex, int baseSalary) {
        super(name, age, sex, baseSalary);
    }

    @Override
    public int getSalary() {
        return super.getBaseSalary();
    }

    @Override
    public final int getBaseSalary() {
        return super.getBaseSalary();
    }
}
