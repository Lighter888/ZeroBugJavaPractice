package Dmitrii.GroupTasks.Tasks_61_80;

import java.util.*;

public class Task_80 {
    //80
    //Write a function that receives an array of positive integers with values
    //between and the length or the array. That function returns the number
    //that most frucient array
    //Integer arr[]={22,101,102,101,102,101,525,88,101,101,101};
    //output 101

    public static void main(String[] args) {

//        int[] arr = {22, 101, 102, 101, 102, 101, 525, 525, 88, 101, 101, 101};
//        int count = 0;
//        Map<String, Integer> map = new HashMap<>();
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    String str = Integer.toString(arr[i]);
//                    map.put(str, count+1);
//                    count++;
//                    break;
//                }
//            }
//        }
//        System.out.println(map.toString());


        Integer arr[]={22,101,102,101,102,101,525,88};
        Map<Integer,Integer>h=new LinkedHashMap<>();

        for(int i=0;i<arr.length;i++){
            int c=Collections.frequency(Arrays.asList(arr),arr[i]);
            if (!h.keySet().equals(arr[i])){
                h.put(arr[i],c);
            }
        }
        int max=Collections.max(h.values());

        ArrayList<Integer>g=new ArrayList<>();

        for(Integer q:h.keySet()){
            if(h.get(q)==max){
                g.add(q);
            }
        }
        System.out.println(g);

    }// Main
}// Class