package Dmitrii.GroupTasks.CodeWars;
    //    Create an abstract Character Class:
 abstract class Character {
    //            - create a private variable NAME with String type.
    private String NAME;
    //- create a protected variable MAX HEALTH with int type, default it to 10.
    protected int MAX_HEALTH = 10;
    //            - create a protected variable HEALTH with int type, default it to MAX HEALTH.
    protected int HEALTH = MAX_HEALTH;

    //            - create a constructor that takes in a String as a parameter and assign it to NAME.
    Character(String name) {
        this.NAME = name;
    }

    //            - create getters/setters for NAME.
    public void setName(String name) {
        this.NAME = name;
    }

    public String getName() {
        return NAME;
    }

    //- create a public abstract method named examine
    public abstract void examine();
}
    //    Create a Warrior class that inherits Character Class:
class Warrior extends Character {
    //            - create a private variable STRENGTH with int type.
    private int STRENGTH;
    //    create 2 constructors:
    //    Default constructor that sets the name to "Vannaka"
    Warrior (){
        super("Vannaka");
    }
    //    A constructor that takes in 3 parameters:
    //            - NAME as type String and assign it to NAME
    // - HEALTH as type int and assign it to HEALTH.
    //    STRENGTH as type int and assign it to STRENGTH,
    Warrior(String name, int health, int strength){
        super(name);
        super.HEALTH = health;
        this.STRENGTH = strength;
    }
    //- create 2 methods:
    // - create a public void heal method that takes in an int parameter named hpHealed
    // - add hpHealed to HEALTH
    public void heal(int hpHealed){
        HEALTH = HEALTH + hpHealed;
    }
    //- C@ate a public void takeDamage method that takes in an int parameter named dmqTaken
    // - subtract dmaTaken from HEALTH
    public void takeDamage(int dmqTaken){
        HEALTH = HEALTH - dmqTaken;
    }
    //    Implement examine method to print out "My name is [NAME)":
    //            - NAME should be the character's NAME variable
    @Override
    public void examine(){
        System.out.println("My name is " + getName());
        System.out.println("Warrior Health is: " + HEALTH);
    }
}

//    Create a Game Class:
class Game{
//            - create a main method:
    public static void main(String[] args) {
//            - Instantiate a Warrior class with a name, health set at 100 and strength set at 50
        Warrior warrior = new Warrior("Dimka", 100, 50);
//            - Have the warrior take
        warrior.takeDamage(99);
//99 damage
//- Have the warrior heal
//20 health
        warrior.heal(20);
//- Have the warrior call examine
        warrior.examine();
    }
}