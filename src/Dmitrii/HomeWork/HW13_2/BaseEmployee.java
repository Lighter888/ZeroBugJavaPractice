package Dmitrii.HomeWork.HW13_2;

public abstract class BaseEmployee {
    public BaseEmployee(String name, int age, String sex, int payPerDay) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.payPerDay = payPerDay;
    }

    private String name;
    private int age;
    private String sex;
    private int payPerDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getPayPerDay() {
        return payPerDay;
    }

    public void setPayPerDay(int payDate) {
        this.payPerDay = payDate;
    }

    public int getSalary (MonthUtils.Month[] monthArray){
        int result = 0;
        for (int i = 0; i < monthArray.length; i++) {
            result += monthArray[i].getWorkDays() * getPayPerDay() ;
        }
        return result;
    }
}
