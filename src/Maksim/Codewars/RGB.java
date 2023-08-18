package Maksim.Codewars;

public class RGB {

    static String convert(int a) {
        return (a < 0) ? "00": (a >= 255) ? "FF" : String.format("%02X", a);
    }
    static String rgb(int r, int g, int b) {
        return convert(r) + convert(g) + convert(b);
    }

    public static void main(String[] args) {
        System.out.println(rgb(-4,256,3));
    }
}
