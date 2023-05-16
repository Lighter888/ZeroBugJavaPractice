package Maksim.Tasks_0_20;

public class Task_15 {
    /*
    FINRA
    total number is 30. if num divided by3 and 5 print FINRA,in num divided by 3
    print FIN,if num divided by 5 print RA
     */

    public static void main(String[] args) {

        String result = "";
        for(int i = 1; i <= 30; i++) {
            if ((i % 5 == 0) && (i % 3 == 0)) {
                result += "FINRA ";
            } else if (i % 5 == 0){
                result += "FIN ";
            } else if ((i % 3 == 0)){
                result += "RA ";
            } else {
                result += i + " ";
            }
//            result += (i % 5 ==0 && i %3 ==0)? "FINRA " : (i%5 == 0) ? "RA "
//                    :(i%3 == 0) ? "FIN " : i+" ";
        }
        System.out.println(result);
    }
}
