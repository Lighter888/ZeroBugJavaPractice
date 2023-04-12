package Dmitrii.HomeWork.HW13_2;

public class Month {
    private final String nameMonth;
    private final int days;
    private final int workDays;

    public Month(String nameMonth, int days, int workDays) {
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
