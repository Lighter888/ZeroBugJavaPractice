package Maksim.InterviewTasks;

import java.util.Arrays;

public class DuplicateInArray {
    /*
    Дан некий массив из 6 строк, где есть повторяющиеся слова.
    Найти и удалить из массива повторяющиеся  слова  и заменить их на null
    ( не строка, а просто как незаполненное значение)
     */
public static String[] removeDuplicates(String[] duplicate){

    String[] clearArr = new String[duplicate.length];

    for (int i = 0; i < clearArr.length-1; i++ ) {
        for (int j = 1; j < clearArr.length-1; j++ ){
            if (duplicate[i].equals(duplicate[j])) {
                clearArr[j] = duplicate[j];
                break;
            }
        }
    }


    return clearArr;
}

    public static void main(String[] args) {

        String[] example = new String[] {"hello","hello","hello","1","er","1","hello","343","1"};

        System.out.println(Arrays.toString(removeDuplicates(example)));
    }
}
