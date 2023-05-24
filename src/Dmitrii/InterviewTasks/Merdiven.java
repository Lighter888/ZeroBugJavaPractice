package Dmitrii.InterviewTasks;

public class Merdiven {
    public static void main(String[] args) {
        merdiven(8);
    }
    public static void merdiven(int number) {
        for (int i = 1; i <= number + 1; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
