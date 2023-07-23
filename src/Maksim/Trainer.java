package Maksim;

import java.util.*;

public class Trainer {

    public static char findMissingLetter(char[] array)
    {
        char missing = ' ';
        for(int i = array[0], j = 0; i < array[array.length - 1]; j++, i++) {
            if (array[j] != i) {
                missing = (char) i;
                break;
            }
        }
        return missing;
    }

    public static void main(String[] args) {

        List<String> namesList = new ArrayList<>(List.of("Ahmet", "Dima", "Max", "Oleg", "Ahmet"));
        Iterator<String> it = namesList.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Ahmet")) {
                it.remove();
            }
        }

        System.out.println(namesList);

        String java = "java";

        List<String> list = new ArrayList<>(List.of(java.split("")));
        Set<String> set = new HashSet<>(list);
        for (String s : set) {
            System.out.println(s + "-" + Collections.frequency(list,s));
        }

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < java.length(); i++) {
            char letter = java.charAt(i);
            if (map.containsKey(letter)) {
                map.put(letter,map.get(letter) + 1);
            } else {
                map.put(letter, 1);
            }
        }
        System.out.println(map.toString().replace("{", ""));

        String brackets = "{([{}]})}";
        String result = brackets;

        for (int i = 0; i < result.length()/2; i++) {
            brackets = brackets.replace("[]", "").replace("{}", "").replace("()", "");
        }
        if (brackets.isEmpty()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println(findMissingLetter(new char[] { 'a','b','c','d','f' }));

    }
}
