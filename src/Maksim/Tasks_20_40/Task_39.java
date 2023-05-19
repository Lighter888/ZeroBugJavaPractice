package Maksim.Tasks_20_40;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_39 {
//    Create 10 random number between 1 and 6

    public static void main(String[] args) {
        int n = 10;
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <=n ; i++) {
            list.add(random.nextInt(1,6));
        }
        System.out.println(list);
    }
}

