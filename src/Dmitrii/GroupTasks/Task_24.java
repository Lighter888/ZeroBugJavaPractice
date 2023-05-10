package Dmitrii.GroupTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task_24 {
//    //24  USE ITERATOR
//    ArrayList -- Remove "Ahmed"
//    ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", Eric", "Ahmed".));

    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        System.out.println(iteratorRemove(namesList));
    }
    public static ArrayList<String> iteratorRemove(ArrayList<String> names){
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Ahmed")) {
                iterator.remove();
            }
        }
        return names;
    }
}
