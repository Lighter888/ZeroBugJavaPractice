package Maksim.Tasks_80_100;

public class Task_81 {

    /*
     String first="abccba"; < palindrome
     String second="abccbx"; < if it is not palindrome change x to a and make it palindrome
     */

    public static String convertToPal(String str) {
        // we will use two 'pointers'. One pointer will start looking from beginning
        // another from the back. If values of pointers are not equal, we can return false
        if (str.length() % 2 != 0 ) {
            return str;
        }
        int j = str.length() - 1; // pointer for the back
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(j - i)) {
                return str.replace(str.charAt(i), str.charAt(j-i));
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(convertToPal("abvvbX"));
    }
}
