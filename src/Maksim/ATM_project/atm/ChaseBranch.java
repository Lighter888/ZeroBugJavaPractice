package Maksim.ATM_project.atm;

import Maksim.ATM_project.main.Account;
import Maksim.ATM_project.main.Data;

public final class ChaseBranch extends AbstractChase implements Register{
    public ChaseBranch() {
        super(5000);
    }

    @Override
    public boolean createAccount(String name, int pin, double deposit) {

        Data.allAccounts.add(new Account(name, Data.currentAvailableNum++, deposit, pin));
        return true;
    }
}
