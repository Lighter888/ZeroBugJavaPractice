package Maksim.Codewars;

public class CheckThreeAndTwo {

//    https://www.codewars.com/kata/5a9e86705ee396d6be000091
        public boolean checkThreeAndTwo(char[] chars) {

            int countA = 0;
            int countB = 0;
            int countC = 0;
            for (char ch: chars) {
                if ((ch + "").equals("a")) {
                    countA++;
                } else if ((ch + "").equals("b")) {
                    countB++;
                } else {
                    countC++;
                }
            }
            // stupid logic may have a better solution
            return ((countA == 2 && countB == 3) || (countA == 3 && countB == 2) || (countC == 2 && countA == 3)
                    || (countC == 3 && countA == 2) || (countC == 2 && countB == 3) || (countC == 3 && countB == 2));
        }

    public static void main(String[] args) {
        System.out.println(new CheckThreeAndTwo().checkThreeAndTwo(new char[] { 'a', 'a', 'b', 'b', 'b' }));
        System.out.println(new CheckThreeAndTwo().checkThreeAndTwo(new char[] { 'a', 'c', 'a', 'c', 'b' }));
        System.out.println(new CheckThreeAndTwo().checkThreeAndTwo(new char[] { 'a', 'a', 'a', 'a', 'a' }));
    }
}
