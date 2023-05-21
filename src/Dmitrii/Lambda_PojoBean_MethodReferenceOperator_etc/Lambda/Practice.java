package Dmitrii.Lambda_PojoBean_MethodReferenceOperator_etc.Lambda;

public class Practice {
    public static void main (String[] args){

        // Lambda provide direct implementation of abstract methods instead of creating the class and implement interface that we use for implementation of the abstract method from interface
        // But we need to keep in mind: Interface must be FunctionalInterface! Functional Interface - interface that have only one method!!!
        // We use annotation @FunctionalInterface to make sure it has only one method otherwise it's giving the Error!

        Printable print = (s) -> "Meow" + s;
            printThing(print);
    }

    public static void printThing (Printable print){
        System.out.println( print.justPrint("!"));
    }

}
