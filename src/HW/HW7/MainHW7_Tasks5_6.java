package HW.HW7;

import HW.HW_5_6.EmployeeUtils;


public class MainHW7_Tasks5_6 {

    static void taskNumber(String str) {
        System.out.println("\n------------------------\n" + str + "\n------------------------");
    }

    public static void main(String[] args) {


        taskNumber("Task 6_1");

        Manager[] m1 = new Manager[]{
                new Manager("Bob", 30, "M", 5000, 200, 4),
                new Manager("Roy", 30, "M", 6000, 250, 5),
                new Manager("Jack", 30, "M", 9000, 300, 10),
                new Manager("Many", 30, "M", 5000, 150, 3),
                new Manager("Patrik", 30, "M", 12000, 500, 15),
        };

        System.out.println(EmployeeUtils.getEmployeeMinSubordinates(m1));

        taskNumber("Task 6_2");

        System.out.println(EmployeeUtils.getEmployeeMaxSubordinates(m1));

        taskNumber("Task 6_3");

        System.out.println(EmployeeUtils.getEmployeeMaxOverpay(m1));

        taskNumber("Task 6_4");

        System.out.println(EmployeeUtils.getEmployeeMinOverpay(m1));

        taskNumber("Task 5");

        Director d1 = new Director("John", 30, "M", 6000, 250, 5);

        System.out.println("Salary director John for first quarter is: "
                + d1.getSalary(MonthUtils.QUARTER1));

        System.out.println("Salary manager Roy for april and december is: "
                + m1[1].getSalary(new Month[]{MonthUtils.APR, MonthUtils.DEC}));

    }
}
