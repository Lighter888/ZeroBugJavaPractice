package Dmitrii.InterviewTasks;

public class T1ConcreteClass implements T1Interface {
    static T1Interface interfaceTest = new T1Interface() {
        @Override
        public void abstractMethod() {
            System.out.println("This is implementation of Abstract method happened, because when was created new object of an interface, default constructor was invoked!");
        }
    };

    // How we're'implementing static method in Concrete Class
    public static void main(String[] args) {
        T1Interface.staticMethod();
        interfaceTest.defaultMethod();
    }

    @Override
    public void abstractMethod() {
        System.out.println("This is implementation of Abstract method of an Interface");
    }

}
