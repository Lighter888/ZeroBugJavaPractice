package Dmitrii.GroupTasks.Tasks_0_20;

public class Task_3 {

    public static void main (String[] args){
//        int a=5;
//        int b=6;
//        change and print
//        a==6;
//        b==5;

        int a = 5;
        int b = 6;


////    Solution 1
//        int temp = 0;
//        temp = a;
//        a = b;
//        b = temp;
//        System.out.println("a==" + a + "\n" + "b==" + b);

//    Solution 2
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a==" + a + "\n" + "b==" + b);
    }
}
