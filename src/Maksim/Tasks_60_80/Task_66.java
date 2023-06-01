package Maksim.Tasks_60_80;

import java.util.Arrays;

public class Task_66 {

    /*
     String [] k = {"bob","joe"};
     String  [] o = {"jones","smith"};

    Complete the combineNames method to return a new String array that
    is composed of the first name and last name of each of the parameters.
    This may be confusing so look at the example:
    first_names = {"bob","joe"}
    last_names = {"jones","smith"}
    returns a new String array with {"bob jones", "joe smith"}
     */

    public static String[] gatherNames(String[] firstName, String[] lastName) {

        String[] gatherNamesArray = new String[firstName.length];
        for (int i = 0; i < gatherNamesArray.length; i++) {
            gatherNamesArray[i] = firstName[i] + " " + lastName[i];
        }
        return gatherNamesArray;
    }

    public static void main(String[] args) {

        String [] first_names = {"bob","joe"};
        String  [] last_names = {"jones","smith"};

        System.out.println(Arrays.toString(gatherNames(first_names,last_names )));
    }
}
