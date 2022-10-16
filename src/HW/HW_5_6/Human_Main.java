package HW.HW_5_6;

public class Human_Main {
    public static void main(String[] args) {

        Human newArr[] = {
                new Human("Alice", 33, "Canada", 5000, "Bachelor"),
                new Human("Boris", 22, "Japan", 12000, "PhD"),
                new Human("Boris", 34, "Hungary", 3500, "High school"),
                new Human("Andy", 18, "Russia", 12000, "College"),
                new Human("Helga", 18, "India", 5000, "High school"),
                new Human("Paul", 45, "USA", 5000, "College"),
                new Human("Monica", 54, "Canada", 6000, "Bachelor"),
                new Human("Tomas", 45, "USA", 50000, "High school"),
                new Human("Boris", 32, "USA", 5000, "Bachelor")};

        Human.sortHumansName(newArr);
//       Human.sortHumansAge(newArr);
//       Human.sortHumansCountry(newArr);
//       Human.sortHumansSalary(newArr);
//       Human.sortHumansEducation(newArr);

        Human.sort(newArr, Human::getCountry);
        Human.sort(newArr, Human::getAge);
    }
}
