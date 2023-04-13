package Dmitrii.HomeWork.HW13_1;

public abstract class BaseManager extends Employee{

    private int numberOfSubordinates;

    public BaseManager(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates(){
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates){
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public abstract int getSALARY_COEFFICIENT();


    @Override
    public int getSalary() {
        if(getNumberOfSubordinates() == 0){
            return getBaseSalary();
        }
        return getBaseSalary() * getSALARY_COEFFICIENT() * getNumberOfSubordinates() / 100;
    }


}
