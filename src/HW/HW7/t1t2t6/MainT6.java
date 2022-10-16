package HW.HW7.t1t2t6;

import HW.HW_5_6.EmployeeUtils;



public class MainT6 {

    static void taskNumber(String str) {
        System.out.println("\n------------------------\n" + str + "\n------------------------");
    }

    public static void main(String[] args) {

        taskNumber("Task 6_1");

        Manager[] m1 = new Manager[]{
                new Manager(5000, "Bob", 0, 4),
                new Manager(6000, "Roy", 0, 5),
                new Manager(9000, "Jack", 0, 10),
                new Manager(5000, "Many", 0, 3),
                new Manager(12000, "Patrik", 0, 15),
        };

        System.out.println(EmployeeUtils.getEmployeeMinSubordinates(m1));

        taskNumber("Task 6_2");

        System.out.println(EmployeeUtils.getEmployeeMaxSubordinates(m1));

        taskNumber("Task 6_3");

        System.out.println(EmployeeUtils.getEmployeeMaxOverpay(m1));

        taskNumber("Task 6_4");

        System.out.println(EmployeeUtils.getEmployeeMinOverpay(m1));


    }
}
