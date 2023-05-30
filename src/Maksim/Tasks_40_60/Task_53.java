package Maksim.Tasks_40_60;

public class Task_53 {

    /*
    Write a for loop that will print out the string in alternating cases,
    with the first letter being lowercase
     */

    public static void main(String[] args) {

        String str = "rSetr#4eDfte4tr";
        StringBuilder revertStr = new StringBuilder();
        revertStr.append(str.toLowerCase().charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if ((Character.isLetter(str.charAt(i))) && (Character.isUpperCase(str.charAt(i)))) {
                    revertStr.append(str.toLowerCase().charAt(i));
                } else if ((Character.isLetter(str.charAt(i))) && (Character.isLowerCase((str.charAt(i))))) {
                    revertStr.append(str.toUpperCase().charAt(i));
                } else {
                revertStr.append(str.charAt(i));
            }
        }
        System.out.println(revertStr);
    }
}
