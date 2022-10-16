package HW.HW7.t3t4t5;

public class Employee {
    private String name;
    private int age;
    private String sex;
    private int salaryPerDay;

    public static void main(String[] args) {

        Employee bob = new Employee();

        bob.setName("Bob");
        bob.setSex("m");
        bob.setAge(41);
        bob.setSalaryPerDay(200);

        System.out.println(bob.getName() + "'s salary total for work months is " + bob.getSalary(new Month[]{MonthUtils.apr, MonthUtils.mar}));
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

    public int getSalary(Month[] monthArray) {
        int salaryTotal = 0;

        for (int i = 0; i < monthArray.length; i++) {

            if (MonthUtils.monthValidation(monthArray[i])) { // true?
                salaryTotal += monthArray[i].getDays() * salaryPerDay;
            } else return 0;
        }
        return salaryTotal;
    }
}
