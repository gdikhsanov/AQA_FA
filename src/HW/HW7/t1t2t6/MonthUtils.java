package HW.HW7.t1t2t6;

public class MonthUtils {

    public static final Month JAN = new Month("Jan", 31, 16);
    public static final Month FEB = new Month("Feb", 28, 19);
    public static final Month MAR = new Month("Mar", 31, 22);
    public static final Month APR = new Month("Apr", 30, 21);
    public static final Month MAY = new Month("May", 31, 18);
    public static final Month JUN = new Month("Jun", 30, 21);
    public static final Month JUL = new Month("Jul", 31, 21);
    public static final Month AUG = new Month("Aug", 31, 23);
    public static final Month SEP = new Month("Sep", 30, 22);
    public static final Month OCT = new Month("Oct", 31, 21);
    public static final Month NOV = new Month("Nov", 30, 21);
    public static final Month DEC = new Month("Dec", 31, 22);

    public static final Month[] YEAR = {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC};

    public static final Month[] quater1 = {JAN, FEB, MAR};
    public static final Month[] quater2 = {APR, MAY, JUN};
    public static final Month[] quater3 = {JUL, AUG, SEP};
    public static final Month[] quater4 = {OCT, NOV, DEC};

    public static boolean monthValidation(Month month) {
        for (Month yearMonth : YEAR) {

            if (month.getName().equalsIgnoreCase(yearMonth.getName())) {
                return true;
            }
        }
        return false;
    }
}

