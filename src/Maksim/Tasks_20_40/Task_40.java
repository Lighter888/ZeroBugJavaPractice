package Maksim.Tasks_20_40;

import java.util.ArrayList;
import java.util.List;

public class Task_40 {

    //40  FIND missing numbers
    public static void main(String[] args) {

        int[] r = {-1,3,5,6,7,9,13,18,70,80,1400,1401,1405};

        List<Integer> list = new ArrayList<>();

        for (int i = r[0]; i <= r[r.length - 1]; i++) {
            list.add(i);
        }
        for (int i : r) {
            list.removeIf(x -> x == i);
        }

        ArrayList<Integer> listOld = new ArrayList<>();

        for(int e = 0; e < r.length - 1; e++){
            for (int i = r[e] + 1; i < r[e + 1]; i++) {
                listOld.add(i);
            }
        }

        System.out.println(listOld);
        System.out.println(list);
    }


}
