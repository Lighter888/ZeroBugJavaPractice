package Maksim.ATM_project.main;

import Maksim.ATM_project.atm.ATM;
import Maksim.ATM_project.atm.ChaseBranch;
import Maksim.ATM_project.atm.ChaseExternal;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ATM atm = null;

        if (Data.get("branch").equals("chase external"))      {
            atm = new ChaseExternal();
        }else if (Data.get("branch").equals("chase branch")) {
            atm = new ChaseBranch();
        }
        System.out.println(Data.allAccounts);
        System.out.println("Enter your login username and pin");

        atm.login(input.next(),input.nextInt() );


        while(Data.currentAccount != null) {
            atm.interfaceMenu(input);
        }


        atm.turnOf();

    }
}
