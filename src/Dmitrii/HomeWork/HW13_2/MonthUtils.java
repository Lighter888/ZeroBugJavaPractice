package Dmitrii.HomeWork.HW13_2;

public class MonthUtils {

    public static class Month {
        private final String nameMonth;
        private final int days;
        private final int workDays;

        private Month(String nameMonth, int days, int workDays) {
            this.nameMonth = nameMonth;
            this.days = days;
            this.workDays = workDays;
        }

        public String getNameMonth() {
            return nameMonth;
        }

        public int getDays() {
            return days;
        }

        public int getWorkDays() {
            return workDays;
        }
    }

    public static final Month JANUARY = new Month("January", 31, 22);
    public static final Month FEBRUARY = new Month("February", 28, 20);
    public static final Month MARCH = new Month("March", 31, 22);
    public static final Month APRIL = new Month("April", 30, 21);
    public static final Month MAY = new Month("May", 31, 22);
    public static final Month JUNE = new Month("June", 30, 21);
    public static final Month JULI = new Month("Juli", 31, 22);
    public static final Month AUGUST = new Month("August", 31, 22);
    public static final Month SEPTEMBER = new Month("September", 30, 21);
    public static final Month OCTOBER = new Month("October", 31, 22);
    public static final Month NOVEMBER = new Month("November", 30, 21);
    public static final Month DECEMBER = new Month("December", 31, 22);

    public static Month[] getQuarterYear(int numberOfQuarter) {

        Month[] firstQuarter = {JANUARY, FEBRUARY, MARCH};
        Month[] secondQuarter = {APRIL, MAY, JUNE};
        Month[] thirdQuarter = {JULI, AUGUST, SEPTEMBER};
        Month[] fourthQuarter = {OCTOBER, NOVEMBER, DECEMBER};

        for (int i = 1; i < 4; i++) ;
        {
            if (numberOfQuarter == 1) {
                return firstQuarter;
            } else if (numberOfQuarter == 2) {
                return secondQuarter;
            } else if (numberOfQuarter == 3) {
                return thirdQuarter;
            } else if (numberOfQuarter == 4) {
                return fourthQuarter;
            } else {
                return null;
            }
        }
    }

    public static Month[] getHalfYear(int numberOfYear) {
        Month[] firstHalf = {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE};
        Month[] secondHalf = {JULI, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
        for (int i = 1; i < 4; i++) ;
        {
            if (numberOfYear == 1) {
                return firstHalf;
            } else if (numberOfYear == 2) {
                return secondHalf;
            } else {
                return null;
            }
        }

        }


    public static Month[] getYear() {
        Month[] fullYear = {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULI, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};

        return  fullYear ;

    }



    }

