package Maksim.Tasks_60_80;

import java.util.Arrays;
import java.util.Collections;

public class Task_77 {

//    String str ="OsOdjjOssh";
//    replace "0" with "a" only the number of 0 is 3 or 4
//    asadjjassh <  BECAUSE THERE IS 3 O

    public static void main(String[] args) {

        String str ="OsOdjjOssh";
        System.out.println(str.replace("O", "a"));

        String str1 ="OsOdjjOssOh";

        for(int i=0;i<str1.length();i++){
            int count= Collections.frequency(Arrays.asList(str1.split("")),"O");
            if(count==3||count==4){
                str1=str1.replace("O","a");
            }
        }
        System.out.println(str1);

    }
}
