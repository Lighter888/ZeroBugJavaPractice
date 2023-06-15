package Maksim.Extra_Tasks;

public class StringBracketsBalanced {
    public static void main(String[] args) {

        String str = "{{}()[[]]}}";
        System.out.println(isStringBalanced(str));
    }

    public static boolean isStringBalanced(String str) {

        while ((str.contains("{}")) || (str.contains("()")) || (str.contains("[]"))) {
            str = str.replace("[]", "").replace("()", "").replace("{}", "");
        }
        return str.length() == 0;
    }
}
