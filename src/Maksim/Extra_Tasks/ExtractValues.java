package Maksim.Extra_Tasks;

import java.text.DecimalFormat;

public class ExtractValues {

    public static void main(String[] args) {

        String str = "40% off Deal $59.99 List Price $99.99";

        int percentage = Integer.parseInt(str.substring(0,str.indexOf('%')));

        double offPrice = Double.parseDouble(str.substring(str.indexOf('$') + 1, str.indexOf(" List")));
        double listedPrice = Double.parseDouble(str.substring(str.lastIndexOf('$') + 1));

        System.out.println(percentage);
        System.out.println(offPrice);
        System.out.println(listedPrice);
        DecimalFormat decimalFormat = new DecimalFormat("##.00");
        double checking = Double.parseDouble(decimalFormat.format((listedPrice * (100.0 - percentage)/100)));
        System.out.println(checking == offPrice ? "PASS" : "FAULT") ;
    }
}
