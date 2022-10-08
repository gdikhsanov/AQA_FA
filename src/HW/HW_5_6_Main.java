package HW;

import HW.HW_5_6.Employee;
import HW.HW_5_6.EmployeeUtils;
import HW.HW_5_6.Person;
import HW.HW_5_6.SalaryUtils;

public class HW_5_6_Main {

    static void taskNumber(String str) {
        System.out.println("\n------------------------\n" + str + "\n------------------------");
    }

    public static void main(String[] args) {

        taskNumber("HW5 #8");

        Person me = new Person(1982);
        Person olga = new Person("Olya", 1982, "f");

        me.setName("Gregory");
        me.setSex("M");

        System.out.println(me.getName() + "\t\t" + me.getAge() + " yrs\tsex: " + me.getSex());

        taskNumber("HW6 #3");

        Employee andy = new Employee("Andy", 1990, "m", 120000);
        Employee ira = new Employee("Irina", 1960, "f", 60000);
        Employee ira1 = new Employee("Irina", 1999, "f", 70000);

        System.out.println(andy.isSameName(ira));

        taskNumber("HW6 #4");

        Employee[] emp = {andy, ira, ira1};

        System.out.println(SalaryUtils.getSum(emp));

        taskNumber("HW6 #5");

        System.out.println(EmployeeUtils.getEmployeeByName(emp, "Irina"));
        System.out.println(EmployeeUtils.getEmployeeByPeaceOfName(emp, "ri")); // toString overrided at Employee
        System.out.println(EmployeeUtils.getSalaryTotal(emp));
        System.out.println(EmployeeUtils.getSalaryMin(emp));
        System.out.println(EmployeeUtils.getSalaryMax(emp));

    }

}
        
        
    


