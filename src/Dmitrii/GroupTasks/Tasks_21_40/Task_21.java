package Dmitrii.GroupTasks.Tasks_21_40;

public class Task_21 {
    public static void main(String[] args){
//        4! = 4 × 3 × 2 × 1 = 24
//        7! = 7 × 6 × 5 × 4 × 3 × 2 × 1 = 5040
//        1! = 1

        int num = 4;
        int sum = 1;
        for(int i=1; i<=num; i++){
            sum = sum*i;
        }
        System.out.println(sum);
    }
}
