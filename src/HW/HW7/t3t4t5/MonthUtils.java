package HW.HW7.t3t4t5;

public class MonthUtils {

    public static Month jan = new Month("Jan", 31, 16);
    public static Month feb = new Month("Feb", 28, 19);
    public static Month mar = new Month("Mar", 31, 22);
    public static Month apr = new Month("Apr", 30, 21);
    public static Month may = new Month("May", 31, 18);
    public static Month jun = new Month("Jun", 30, 21);
    public static Month jul = new Month("Jul", 31, 21);
    public static Month aug = new Month("Aug", 31, 23);
    public static Month sep = new Month("Sep", 30, 22);
    public static Month oct = new Month("Oct", 31, 21);
    public static Month nov = new Month("Nov", 30, 21);
    public static Month dec = new Month("Dec", 31, 22);

    public static Month[] year = {jan, feb, mar, apr, may, jun, jul, aug, sep, oct, nov, dec};

    public static Month[] quater1 = {jan, feb, mar};
    public static Month[] quater2 = {apr, may, jun};
    public static Month[] quater3 = {jul, aug, sep};
    public static Month[] quater4 = {oct, nov, dec};

    public static boolean monthValidation(Month month) {
        for (Month yearMonth : year) {

            if (month.getName().equalsIgnoreCase(yearMonth.getName())) {
                return true;
            }
        }
        return false;
    }
}

