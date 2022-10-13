package HW.HW_5_6;

public class Human_Main {
    public static void main(String[] args) {

        Human q = new Human("Alice", 33, "Canada", 5000, "Bachelor");
        Human w = new Human("Boris", 22, "Japan", 12000, "PhD");
        Human e = new Human("Boris", 34, "Hungary", 3500, "High school");
        Human r = new Human("Andy", 18, "Russia", 12000, "College");
        Human t = new Human("Helga", 18, "India", 5000, "High school");
        Human y = new Human("Paul", 45, "USA", 5000, "College");
        Human u = new Human("Monica", 54, "Canada", 6000, "Bachelor");
        Human i = new Human("Tomas", 45, "USA", 50000, "High school");
        Human o = new Human("Boris", 32, "USA", 5000, "Bachelor");

        Human newArr[] = new Human[]{q, w, e, r, t, y, u, i, o};

       Human.sortHumansName(newArr);
//       Human.sortHumansAge(newArr);
//       Human.sortHumansCountry(newArr);
//       Human.sortHumansSalary(newArr);
//       Human.sortHumansEducation(newArr);

        Human.sort(newArr, Human::getCountry);
        Human.sort(newArr, Human::getAge);
    }
}
