package Maksim.Tasks_0_20;

public class Task_19 {

    /*
    1. Write a return method that can verify if a password is valid or not.
    1. Password MUST be at least have 6 characters and should not contain space
    2. PassWord should at least contain one upper case letter
    3. PassWord should at least contain one lowercase letter
    4. Password should at least contain one special characters
    5. Password should at least contain a digit
     */

    public static boolean isPasswordValid(String password) {

        String specialChars = "~!@#$%^&*()?|";
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (specialChars.indexOf(ch) != -1) {
                hasSpecialChar = true;
            }
        }
        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
    }

    public static void main(String[] args) {

        System.out.println("Password is valid: "  + isPasswordValid("EWrt5y%p"));
    }
}
