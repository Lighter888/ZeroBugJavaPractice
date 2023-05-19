package Maksim.Tasks_20_40;

public class Task_34 {

    /*
    USE double
    Don't use sort get max  4.5
    String[] arr = {"1","2.5", "3", "3.5", "4.5"};

    output
    4.5
     */

    public static void main(String[] args) {

        String[] arr = {"1","2.5", "3", "3.5", "4.5"};

        double max = Double.MIN_VALUE;

        for (String s : arr) {
            if (Double.parseDouble(s) > max) {
                max = Double.parseDouble(s);
            }
        }
        System.out.println(max);
    }
}
