package Dmitrii.HomeWork.HW13_2;



public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Alex", 33, "male", 200);
        Manager manager = new Manager("Dima", 39, "mail", 500, 20);

        System.out.println(employee.getName() + ", age " + employee.getAge() + ", sex " + employee.getSex() + ", Salary " + employee.getSalary());

    }
}
