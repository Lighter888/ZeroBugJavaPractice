package Maksim.Extra_Tasks;

public class CountCharactersInString {

    public static void countCharacters(String str) {

        String result = "";
        int count;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if ((count >= 3) && (!result.contains(str.charAt(i) + ""))) {
                result += str.charAt(i) + "=" + count + " ";
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {

        countCharacters("Hello, How are H you udoinguu?");
    }
}
