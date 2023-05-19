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

    public static void buildSquare(int n) {

        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                System.out.println(" " + "__".repeat(n));
            } else if (i != n) {
                System.out.println("|" + "  ".repeat(n) + "|");
            } else {
                System.out.println("|" + "__".repeat(n) + "|");
            }
        }
    }
    public static void main(String[] args) {

        buildTriangle(3);
        System.out.println();
        buildSquare(4);
    }
}
