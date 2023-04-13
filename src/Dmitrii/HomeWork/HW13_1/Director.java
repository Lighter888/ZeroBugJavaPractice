package Dmitrii.HomeWork.HW13_1;

public final class Director extends BaseManager{

    public final int SALARY_COEFFICIENT= 9;

    public Director(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }


    public int getSALARY_COEFFICIENT(){

        return SALARY_COEFFICIENT;
    }


}
