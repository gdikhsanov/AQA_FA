package HW.HW7.t1t2t6;

public class Worker extends Employee{

    public Worker(int baseSalary, String name, int salary) {
        super(baseSalary, name, salary);
    }

    @Override
    public int getSalary() {
        return super.getBaseSalary();
    }
}
