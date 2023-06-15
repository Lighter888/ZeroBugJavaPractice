package Maksim.Extra_Tasks;

public class RemoveExtraSpaces {

    public static void main(String[] args) {

        String str = " Try remove    extra   spaces   ";
        System.out.println(str.replaceAll("\\s+", " ").trim());
    }
}
