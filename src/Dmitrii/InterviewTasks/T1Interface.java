package Dmitrii.InterviewTasks;
        public interface T1Interface {
            void abstractMethod();
            default void defaultMethod(){
                privateMethod();
            }
            static void staticMethod(){
                System.out.println("This is static method and I can call this method as class level!");
            }
            private void privateMethod(){
                System.out.println("This method is private! And no one can achieve this method accept current interface!" +
                        " Because private keyword is a access modifier that provide access to the method only within a class!");
            }
}
