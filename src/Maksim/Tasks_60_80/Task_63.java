package Maksim.Tasks_60_80;

public class Task_63 {


//    {  {9, 8, 7}, {6},  {5,4,3,2,1,0}   };  output should be
//      5 4 3 2 1 0 6 9 8 7

    public static String getStringNum (int[][] arrNum) {
        String result = "";
        for (int i = arrNum.length - 1; i >= 0; i--) {
            for (int j = 0; j < arrNum[i].length ; j++) {
                result += arrNum[i][j] + " ";
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[][] arrNum = {  {9, 8, 7}, {6},  {5,4,3,2,1,0}   };
        System.out.println(getStringNum(arrNum));
    }

}
