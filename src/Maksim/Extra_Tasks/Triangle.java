package Maksim.Extra_Tasks;

public class Triangle {

    public static void buildTriangle(int n) {

        for (int i = 0; i <= n - 1; i++) {
            if (i != n - 1) {
                System.out.println(" ".repeat(n - i - 1) + "/" + "  ".repeat(i) + "\\");
            } else {
                System.out.println("/" + "__".repeat(i) + "\\");
            }
        }
    }
    public static void main(String[] args) {

        buildTriangle(3);
    }
}
