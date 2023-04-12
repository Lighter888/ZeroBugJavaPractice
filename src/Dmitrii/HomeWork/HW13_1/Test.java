package Dmitrii.HomeWork.HW13_1;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker(30000, "Valera");
        Manager manager1 = new Manager(10000, "Vova", 0);
        Manager manager2 = new Manager(10000, "Sasha", 20);
        Director director1 = new Director(10000, "Irina", 300);
        Director director2 = new Director(10000, "Dima", 200);

        System.out.println(worker.getName() + "'s Salary is:  " + worker.getSalary());
        System.out.println(manager1.getName() + "'s Salary is:  " + manager1.getSalary());
        System.out.println(manager2.getName() + "'s Salary is:  " + manager2.getSalary());
        System.out.println(director1.getName() + "'s Salary is:  " + director1.getSalary());
        System.out.println(director2.getName() + "'s Salary is:  " + director2.getSalary());

        Employee employee = new Employee(5000, "Max") {
            @Override
            public int getSalary() {
                return getBaseSalary();

            }



        };
        System.out.println(employee.getName() + "'s Salary is:  " + employee.getSalary());

        System.out.println();

    }
}
