package HW.HW7;

public abstract class Employee extends BaseEmployee {

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

    public abstract int getSalary();

//    public int getSalary(Month[] monthArray) {
//        int salaryTotal = 0;
//
//        for (int i = 0; i < monthArray.length; i++) {
//
//            if (MonthUtils.monthValidation(monthArray[i])) { // true?
//                salaryTotal += monthArray[i].getWorkingDays() * this.getSalaryPerDay(); // умножаем на рабочие дни
//            } else return 0;
//        }
//        return salaryTotal;
//    }
//
//    public abstract int getSalary();


}
