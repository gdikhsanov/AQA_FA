package HW.HW7.t3t4t5;

public class Manager {
    private String name;
    private int age;
    private String sex;
    private int salaryPerDay;
    private int numberOfSubordinates;

    public static void main(String[] args) {

        Manager roy = new Manager();

        roy.setName("Roy");
        roy.setSex("m");
        roy.setAge(35);
        roy.setSalaryPerDay(250);
        roy.setNumberOfSubordinates(15);

        System.out.println(roy.getName() + "'s salary total for work months is " + roy.getSalary(new Month[]{MonthUtils.apr, MonthUtils.mar}));
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

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public void setSalaryPerDay(int salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public int getSalary(Month[] monthArray) {
        int salaryTotal = 0;

        for (int i = 0; i < monthArray.length; i++) {

            if (MonthUtils.monthValidation(monthArray[i])) { // true?
                salaryTotal += (monthArray[i].getDays() * salaryPerDay * (100 + getNumberOfSubordinates())) / 100;
            } else return 0;
        }
        return salaryTotal;
    }
}
