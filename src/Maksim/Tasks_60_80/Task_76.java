package Maksim.Tasks_60_80;

import java.util.ArrayList;

public class Task_76 {

//    Output:
//    Aa Bb Cc Dd Ee Ff Gg Hh Ii Jj Kk Ll Mm Nn Oo Pp Qq Rr Ss Tt Uu Vv Ww Xx Yy Zz
//    [Aa , Bb , Cc , Dd , Ee , Ff , Gg , Hh , Ii , Jj , Kk , Ll , Mm , Nn , Oo , Pp , Qq , Rr , Ss , Tt ...]

    public static void main(String[] args) {

        char a = 97;
        char z = 122;
        System.out.println(a);
        System.out.println(z);

        String str = "";
        ArrayList<String> list = new ArrayList<>();

        char i;
        for (i = 97; i <= 122; i++) {
            str += i + (i + "").toUpperCase() + " ";
            list.add(i + (i + "").toUpperCase());
        }

        System.out.println(str);
        System.out.println(list);
    }
}
