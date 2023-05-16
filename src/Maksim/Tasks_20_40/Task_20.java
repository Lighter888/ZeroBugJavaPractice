package Maksim.Tasks_20_40;

public class Task_20 {
    /*
    Write a function:
    that, given a positive integer N, prints the consecutive numbers from 1 to N,
    each on a separate line. However, any number divisible by 2, 3 or 5 should be
    replaced by the word Codility, Test or Coders respectively. If a number is
    divisible by more than one of the numbers: 2,3 or 5, it should be replaced by
    a concatenation of the respective words Codility, Test and Coders in this
    given order. For example, numbers divisible by both 2 and 3 should be
    replacée by CodilityTest and numbers divisible by all three numbers: 2,3
    and 5, should be replaced by CodilityTestCoders.
     */
    public static void main(String[] args) {
        int N=14;
        String result = "";

        for (int i = 1; i <= N; i++) {

            result+=(i%2==0&&i%3==0&&i%5==0)?"CodilityTestCoders\n":(i%2==0&&i%3==0)?"CodilityTest\n":
                    (i % 2==0 && i %5==0)?"CodilityCoders\n":(i % 3 == 0 && i % 5 ==0)?"TestCoders\n":
                            (i % 2 ==0)?"Codility\n":(i % 5 == 0)?"Coders\n":(i % 3 == 0)?"Test\n": i + "\n";
        }
        System.out.println(result);
    }

}
