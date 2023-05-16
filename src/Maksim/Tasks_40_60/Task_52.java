package Maksim.Tasks_40_60;

import java.util.*;

public class Task_52 {

//    write a method that can print out the unique elements from an int array
//
//    Ex: {1,1,2,3,3} ==> 2
//    {6,6,7,7,8,9} ==> 8 9
//            --write a method that can print out the unique elements from a double array
//    Note: Apply method overloading

    public String uniqueElementArray(Integer[] arr) {
        String result = "";
        List<Integer> listNum = new ArrayList<>(Arrays.asList(arr));
        for (Integer i : listNum) {
            int count = Collections.frequency(listNum, i);
            if (count == 1) {
                result += " " + i;
            }
        }
        return result;
    }

    public String uniqueElementArray(Integer[][] arr) {
        String result = "";
        List<Integer> listNum = new ArrayList<>();
        for (Integer[] subArr : arr) {
            for (Integer num : subArr) {
                listNum.add(num);
            }
        }
        for (Integer i : listNum) {
            int count = Collections.frequency(listNum, i);
            if (count == 1) {
                result += " " + i;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        //Overloading method if method none static call instance of class Task_52
        Task_52 task52 = new Task_52();

        System.out.println(task52.uniqueElementArray(new Integer[] {6,6,7,7,8,9}));
        System.out.println(task52.uniqueElementArray(new Integer[][] {{6,6,7,7,8,9}, {2,3,5,6,2,3,6}}));

    }


}
