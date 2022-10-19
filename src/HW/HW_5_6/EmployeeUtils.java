package HW.HW_5_6;

public class EmployeeUtils {

    //1_1
    public static Employee getEmployeeByName(Employee[] employeeArray, String name) {

        Employee result = null;

        for (Employee i : employeeArray) {

            if (i.getName() != null && i.getName().equalsIgnoreCase(name)) {

                result = i;
                break;
            }
        }
        return result;

        //1_2

//        public static String getEmployeeByName(Employee[] employeeArray, String name) {
//
//            StringBuilder fountEmployees = new StringBuilder();
//
//        for (Employee i : employeeArray) {
//
//            if (i.getName() != null && i.getName().equalsIgnoreCase(name)) {
//
//                fountEmployees.append(i.getName() + "\t" + i.getSex() + "\t" + i.getAge() + "\t" + i.getSalary() + "\n");
//            }
//        }
//        return fountEmployees.toString();

    }

    //2

    public static Employee getEmployeeByPeaceOfName(Employee[] employeeArray, String name) {

        Employee result = null;

        for (Employee i : employeeArray) {
            if (i.getName() != null && i.getName().matches(".*" + name + ".*")) {
                result = i;
                break;
            }
        }
        return result; // объект(типа Employee)
    }

    //3

    public static int getSalaryTotal(Employee[] employeeArray) {

        int salaryTotal = 0;

//        for (int i = 0; i < employeeArray.length; i++) {
//            salaryTotal += employeeArray[i].getSalary();
//        }

        for (Employee i : employeeArray) {
            salaryTotal += i.getSalary();
        }
        return salaryTotal;
    }

    //4

    public static int getSalaryMin(Employee[] employeeArray) {

        int salaryMin = Integer.MAX_VALUE;

        for (Employee i : employeeArray) {
            salaryMin = Math.min(i.getSalary(), salaryMin);
        }
        return salaryMin;
    }

    //6

    public static int getSalaryMax(Employee[] employeeArray) {

        int salaryMax = Integer.MIN_VALUE;

        for (Employee i : employeeArray) {
            salaryMax = Math.max(i.getSalary(), salaryMax);
        }
        return salaryMax;
    }

    //HW_7_6_1
    public static int getEmployeeMinSubordinates(HW.HW7.Manager[] managerArray) {

        int subMin = managerArray[0].getNumberOfSubordinates();

        for (int i = 0; i < managerArray.length; i++) {

            if (managerArray[i].getNumberOfSubordinates() < subMin) {
                subMin = managerArray[i].getNumberOfSubordinates();
            }
        }
        return subMin;
    }

    //HW_7_6_2
    public static int getEmployeeMaxSubordinates(HW.HW7.Manager[] managerArray) {

        int subMax = managerArray[0].getNumberOfSubordinates();

        for (int i = 0; i < managerArray.length; i++) {

            if (managerArray[i].getNumberOfSubordinates() > subMax) {
                subMax = managerArray[i].getNumberOfSubordinates();
            }
        }
        return subMax;
    }

    //HW_7_6_3
    public static int getEmployeeMaxOverpay(HW.HW7.Manager[] managerArray) {

        int overMax = managerArray[0].getSalary() - managerArray[0].getBaseSalary();

        for (int i = 1; i < managerArray.length; i++) {

            if (managerArray[i].getSalary() - managerArray[i].getBaseSalary() > overMax) {
                overMax = managerArray[i].getSalary() - managerArray[i].getBaseSalary();
            }
        }
        return overMax;
    }

    //HW_7_6_4
    public static int getEmployeeMinOverpay(HW.HW7.Manager[] managerArray) {

        int overMin = managerArray[0].getSalary() - managerArray[0].getBaseSalary();

        for (int i = 1; i < managerArray.length; i++) {

            if (managerArray[i].getSalary() - managerArray[i].getBaseSalary() < overMin) {
                overMin = managerArray[i].getSalary() - managerArray[i].getBaseSalary();
            }
        }
        return overMin;
    }
}
