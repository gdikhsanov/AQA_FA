package HW.HW_5_6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;

public class Human {

    private String name;
    private int age;
    private String country;
    private int salary;
    private String education;

    public Human(String name, int age, String country, int salary, String education) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.salary = salary;
        this.education = education;
    }

    public static void printOneHuman(Human human) {
        System.out.printf("%-15s %-15d %-15s %-15d %-15s\n", human.getName(), human.getAge(), human.getCountry(),
                human.getSalary(), human.getEducation());
    }

    public static void printHumanArr(Human[] humanArr) {
        for (int i = 0; i < humanArr.length; i++) {                    //for (Human human : humanArr) { //не уверен в сортировке\направлении
            //printOneHuman(human);
            printOneHuman(humanArr[i]);
        }
    }

    public static void sortHumansName(Human[] humanArr) {

        String[] namesArr = new String[humanArr.length];

        for (int i = 0; i < namesArr.length; i++) {
            namesArr[i] = humanArr[i].getName();
        }

        Arrays.sort(namesArr);

        Human[] resultArr = new Human[humanArr.length];

        for (int i = 0; i < namesArr.length; i++) {

            for (int j = 0; j < humanArr.length; j++) {

                if (namesArr[i].equalsIgnoreCase(humanArr[j].getName())
                        && !Arrays.stream(resultArr).anyMatch(humanArr[j]::equals))  //Arrays.asList(resultArr).contains(humanArr[j])
                {                                                                    //добавить проверку на null
                    resultArr[i] = humanArr[j];
                    break;
                }
            }
        }
        printHumanArr(resultArr);
        System.out.println();
    }

    public static void sortHumansAge(Human[] humanArr) {

        int[] intArr = new int[humanArr.length];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = humanArr[i].getAge();
        }

        Arrays.sort(intArr);

        Human[] resultArr = new Human[humanArr.length];

        for (int i = 0; i < intArr.length; i++) {

            for (int j = 0; j < humanArr.length; j++) {

                if (intArr[i] == (humanArr[j].getAge())
                        && !Arrays.stream(resultArr).anyMatch(humanArr[j]::equals))  //Arrays.asList(resultArr).contains(humanArr[j])
                {                                                                    //добавить проверку на null
                    resultArr[i] = humanArr[j];
                    break;
                }
            }
        }
        printHumanArr(resultArr);
        System.out.println();
    }

    public static void sortHumansCountry(Human[] humanArr) {

        String[] namesArr = new String[humanArr.length];

        for (int i = 0; i < namesArr.length; i++) {
            namesArr[i] = humanArr[i].getCountry();
        }

        Arrays.sort(namesArr);

        Human[] resultArr = new Human[humanArr.length];

        for (int i = 0; i < namesArr.length; i++) {

            for (int j = 0; j < humanArr.length; j++) {

                if (namesArr[i].equalsIgnoreCase(humanArr[j].getCountry())           //Arrays.stream(resultArr).noneMatch(humanArr[j]::equals))
                        && Arrays.stream(resultArr).noneMatch(humanArr[j]::equals))  //Arrays.asList(resultArr).contains(humanArr[j])
                {                                                                    //добавить проверку на null
                    resultArr[i] = humanArr[j];
                    break;
                }
            }
        }
        printHumanArr(resultArr);
        System.out.println();
    }

    public static void sortHumansSalary(Human[] humanArr) {

        int[] intArr = new int[humanArr.length];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = humanArr[i].getSalary();
        }

        Arrays.sort(intArr);

        Human[] resultArr = new Human[humanArr.length];

        for (int i = 0; i < intArr.length; i++) {

            for (int j = 0; j < humanArr.length; j++) {

                if (intArr[i] == (humanArr[j].getSalary())
                        && !Arrays.stream(resultArr).anyMatch(humanArr[j]::equals))  //Arrays.asList(resultArr).contains(humanArr[j])
                {                                                                    //добавить проверку на null
                    resultArr[i] = humanArr[j];
                    break;
                }
            }
        }
        printHumanArr(resultArr);
        System.out.println();
    }

    public static void sortHumansEducation(Human[] humanArr) {

        String[] namesArr = new String[humanArr.length];

        for (int i = 0; i < namesArr.length; i++) {
            namesArr[i] = humanArr[i].getEducation();
        }

        Arrays.sort(namesArr);

        Human[] resultArr = new Human[humanArr.length];

        for (int i = 0; i < namesArr.length; i++) {

            for (int j = 0; j < humanArr.length; j++) {

                if (namesArr[i].equalsIgnoreCase(humanArr[j].getEducation())
                        && !Arrays.stream(resultArr).anyMatch(humanArr[j]::equals))  //Arrays.asList(resultArr).contains(humanArr[j])
                {                                                                    //добавить проверку на null
                    resultArr[i] = humanArr[j];
                    break;
                }
            }
        }
        printHumanArr(resultArr);
        System.out.println();
    }

    public static <V extends Comparable<V>> void sort(Human[] humanArr, Function<Human, V> getValue) {
        Arrays.stream(humanArr).sorted(Comparator.comparing(getValue)).forEachOrdered(Human::printOneHuman);
        System.out.println();
    }

    public String getName() {
        return Objects.requireNonNullElse(this.name, "");
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() { //Для метода Сергея нужен референсный тип. Моему достаточно int
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return Objects.requireNonNullElse(this.country, "");
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getSalary() { //Для метода Сергея нужен референсный тип. Моему достаточно int
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEducation() {
        return Objects.requireNonNullElse(this.education, "");
    }

// Сортировка от Сергея. Передаём сеттер в качестве аргумента
    //Нужен референсный тип для числовых полей. Моему достаточно int

    public void setEducation(String education) {
        this.education = education;
    }
}


