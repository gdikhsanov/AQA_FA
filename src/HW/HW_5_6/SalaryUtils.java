package HW.HW_5_6;

public class SalaryUtils {



    public static int getSum(Employee[] employeeArray) {

        int salaryTotal = 0;

//        for (int i = 0; i < employeeArray.length; i++) {
//            salaryTotal += employeeArray[i].getSalary();
//        }

        for (Employee i : employeeArray) {
            salaryTotal += i.getSalary();
        }
        return salaryTotal;
    }
}

