package HW;

import java.time.Year;
import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String sex;
    private int yearOfBirth;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
       if (this.name != null) {
           if (this.sex.equalsIgnoreCase("m")) {

               return "Mr. " + this.name;
           } else if (this.sex.equalsIgnoreCase("f")) {
               return "Ms. " + this.name;
           }
           return "";
       }
        return "";
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return Objects.requireNonNullElse(this.sex, "");
    }

    public Person(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    };

    public Person(String name, int yearOfBirth, String sex){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.sex = sex;
    };


     public int getAge() {
        return Year.now().getValue() - yearOfBirth;
    }


}
