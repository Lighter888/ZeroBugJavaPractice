package Maksim.Tasks_60_80;

public class Task_71 {

    /*
      String a = "a2b5c7a9f0dafa2s6a8d5a";
      String str="";
      output
      aaaaaa2b5c79f0df2s68d5
     */

    public static void main(String[] args) {

        String a = "a2b5c7a9f0dafa2s6a8d5a";
        String str = "";
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            if ( (a.charAt(i) + "").equals("a") ) {
                builder.append(a.charAt(i));
            } else {
                str += a.charAt(i);
            }
        }
        System.out.println(builder.append(str));
    }
}
