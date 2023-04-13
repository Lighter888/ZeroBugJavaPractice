package Dmitrii.HomeWork.HW13_1;

public final class Manager extends BaseManager{

    public final int SALARY_COEFFICIENT= 3;

    public Manager(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }


    public int getSALARY_COEFFICIENT(){

        return SALARY_COEFFICIENT;
    }


}
