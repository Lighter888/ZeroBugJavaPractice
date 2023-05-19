package Maksim.Extra_Tasks;

public class SunOfoddNumbers {
    public static int rowSumOddNumbers(int n) {

        int sum = 0;
        int[][] arrNum = new int[n][n];
        int count = 1;
        int odd = 0;
        for (int i = 0; i < arrNum.length; i++) {
            for (int j = 0; j < arrNum[i].length; j++) {
                if ( j < count) {
                    arrNum[i][j] += odd + 1;
                    odd += 2;
                }
                if ( i == n - 1) {
                    sum += arrNum[i][j];
                }
            }
            count++;
        }

    return sum;
    }
    public static void main(String[] args) {

        System.out.println(rowSumOddNumbers(42));
    }
}
