package Dmitrii.GroupTasks;

public class Task_63 {

//    //63
//    {  {9, 8, 7}, {6},  {5,4,3,2,1,0}   };  output should be
//5 4 3 2 1 0 6 9 8 7


    public static String task63(int[][] arr){
        String temp= "";
        for (int i= arr.length-1; i>=0; i--){
            for (int j = 0; j < arr[i].length; j++) {
                temp += arr[i][j]+ " ";
            }
        }
        return temp;
    }

public static void main(String[] args) {
    int[][] a = {  {9, 8, 7}, {6},  {5,4,3,2,1,0}   };
    System.out.println(task63( a));


}





}
