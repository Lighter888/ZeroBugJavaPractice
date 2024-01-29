package Dmitrii.HomeWork;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        String str = "aaacccccbbrrrr";
//        String uniqueStr = "";
//        char [] arr = str.toCharArray();
//        Set<Character> set = new HashSet<>();
//        for(char each : arr){
//            if(set.add(each)){
//                uniqueStr += each;
//            }
//        }
//        System.out.println(uniqueStr);
//        String unique = Set.of(str.toCharArray()).stream().map(String::valueOf).collect(Collectors.joining());
//        System.out.println(unique);

        String unique = str.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(unique);



}
    public String bla (String a, int b){
        return a;
    }
    public int bla (String a){
        return 1;
    }
}
