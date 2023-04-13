package Dmitrii.HomeWork.HW13_2;

public final class Manager extends BaseEmployee{
    private int numberOfSubordinates;

    public Manager(String name, int age, String sex, int payPerDay, int numberOfSubordinates) {
        super(name, age, sex, payPerDay);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
    public int getSalary(MonthUtils.Month[] monthArray){
        return (int) (super.getSalary(monthArray)*(1.0 + getNumberOfSubordinates()/100));
    }








}
