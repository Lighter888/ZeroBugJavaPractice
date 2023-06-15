package Maksim.Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindOdd {

    //https://www.codewars.com/kata/54da5a58ea159efa38000836

    public static void main(String[] args) {

        System.out.println(findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));

        System.out.println(dimonMethod(new Integer[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
    }

    public static  List<Integer> dimonMethod(Integer[] arr){

        List<Integer> oddNumList = new ArrayList<>();
        List<Integer> arrList = Arrays.asList(arr);
        int count = 0;


        Collections.sort(arrList);
        for (int i = 0; i < arrList.size(); i++) {
            for (int j = 0; j < arrList.size(); j++) {
                if (arrList.get(i) == arrList.get(j)) {
                    count++;
                    }
                }
                if (count % 2 != 0) {
                    oddNumList.add((arrList.get(i)));
                }
                count = 0;
            }
        return oddNumList;
    }

    public static int findIt(int[] a) {

        List<Integer> listN = new ArrayList<>();
        List<Integer> list = Arrays.stream(a).boxed().toList();
        for (Integer num : list) {
            int count = Collections.frequency(list, num);
            if (count % 2 == 1) {
                listN.add(num);
            }
        }
        System.out.println(listN);
        return listN.get(listN.size() - 1);
    }
}
