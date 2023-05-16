package Maksim.Extra_Tasks;

public class Triangle {

    public static void main(String[] args) {

        int n = 3;

        for (int i = 0; i <= n; i++) {
            if (i != n) {
                System.out.println(" ".repeat(n - i) + "/" + " ".repeat(2 * i) + "\\");
            } else {
                System.out.println("/" + "_".repeat(2 * i) + "\\");
            }
        }
    }
}
