package HW.HW_5_6;

import java.time.Year;
import java.util.Objects;

public class Person {
     String name;
     String sex;
     int yearOfBirth;

    public Person(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Person(String name, int yearOfBirth, String sex) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.sex = sex;
    }

    public String getName() {

//        return Objects.requireNonNullElse(this.name, ""); //замена проверки на ноль через if

        if (this.name != null) {
//            if (this.sex.equalsIgnoreCase("m")) {
//
//                return "Mr. " + this.name;
//            }
//            else if (this.sex.equalsIgnoreCase("f")) {
//                return "Ms. " + this.name;
//            }
//            else
                return name;

        }
        return "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return Objects.requireNonNullElse(this.sex, "");
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return Year.now().getValue() - yearOfBirth;
    }


}
