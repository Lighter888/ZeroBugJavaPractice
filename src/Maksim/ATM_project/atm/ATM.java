package Maksim.ATM_project.atm;

import java.util.Scanner;

public abstract class ATM implements Machine, MoneyFunctions{

    private final double withdrawLimit;

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    private boolean powerOn;

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    public ATM(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public abstract void interfaceMenu(Scanner input);
    public abstract void login(String username, int pin);
    public abstract void logout();


}
