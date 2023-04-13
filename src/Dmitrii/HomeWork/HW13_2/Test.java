package Dmitrii.HomeWork.HW13_2;


import java.util.Arrays;

import static Dmitrii.HomeWork.HW13_2.MonthUtils.*;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Alex", 33, "male", 200);
        Manager manager = new Manager("Dima", 39, "male", 500, 20);
        MonthUtils.Month[] arrJuneAndJuliEmp = new MonthUtils.Month[]{JUNE, JULI};
        MonthUtils.Month[] arrFirstHalfYearEmp = MonthUtils.getHalfYear(1);
        MonthUtils.Month[] arrSecondHalfYearEmp = MonthUtils.getHalfYear(2);

        System.out.println(employee.getName() + ", age " + employee.getAge() + ", sex " + employee.getSex() + ", Salary " + employee.getSalary(arrJuneAndJuliEmp));

        System.out.println(employee.getName() + ", age " + employee.getAge() + ", sex " + employee.getSex() + ", Salary " + employee.getSalary(arrFirstHalfYearEmp));

        System.out.println(manager.getName() + ", age " + manager.getAge() + ", sex " + manager.getSex() + ", Salary " + manager.getSalary(arrSecondHalfYearEmp));

    }
}
