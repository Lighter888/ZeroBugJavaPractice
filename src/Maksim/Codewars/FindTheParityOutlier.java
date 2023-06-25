package Maksim.Codewars;

import java.util.stream.IntStream;

public class FindTheParityOutlier {
    //https://www.codewars.com/kata/5526fc09a1bbd946250002dc

    public static int findElement(int[] integers){
        int odd = 0;
        int even = 0;

        for(int i = 0; i < 3; i++){
            if (integers[i] % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }

        if (even > odd){
            for (int integer : integers) {
                if (integer % 2 != 0) {
                    return integer;
                }
            }
        } else{
            for (int integer : integers) {
                if (integer % 2 == 0) {
                    return integer;
                }
            }
        }
        return 0;
    }
    static int find(int[] integers){
        int countOdd = 0, countEven = 0;
        for (int integer : integers) {
            if (integer % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        return (countEven > countOdd) ? IntStream.of(integers).filter(x->x%2!=0).sum(): IntStream.of(integers).filter(x->x%2==0).sum();
    }

    public static void main(String[] args) {
        int[] exampleTest2 = {2,6,8,-10,3};

        System.out.println(find(exampleTest2));
    }
}
