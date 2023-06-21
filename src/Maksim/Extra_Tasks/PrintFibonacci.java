package Maksim.Extra_Tasks;

public class PrintFibonacci {

    public static void printFib(int n) {
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }

    public static void main(String[] args) {
        printFib(10);
    }
}
