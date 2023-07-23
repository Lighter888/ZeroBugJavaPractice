package Maksim.ATM_project.atm;

import Maksim.ATM_project.Exceptions.*;
import Maksim.ATM_project.main.Account;
import Maksim.ATM_project.main.Data;

import java.util.Scanner;

public abstract class AbstractChase extends ATM {

    public AbstractChase(double withdrawLimit) {
        super(withdrawLimit);
        turnOn();
    }

    @Override
    public void turnOn() {
        for (int i = 0; i < 5; i++) {
            System.out.println("ATM is booting up..");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        setPowerOn(true);
        Data.loadAccounts();
    }

    @Override
    public void turnOf() {
        System.out.println("ATM is shutting down...");
        setPowerOn(false);
        Data.allAccounts.clear();
    }

    @Override
    public void login(String username, int pin) {
        for (Account each: Data.allAccounts) {
            if (each.getUserName().equals(username)) {
                if (each.getPin() == pin) {
                    Data.currentAccount = each;
                    System.out.println("Logged in");
                    return;
                } else {
                    throw new InvalidPinException();
                }
            }
        }
        throw new UserNotFoundException("Username is not found");
    }

    @Override
    public void logout() {
        System.out.println("Logged out");
        Data.currentAccount = null;
    }

    @Override
    public double withdraw(double amount) {
        if (amount <= getWithdrawLimit()) {
            if (amount <= Data.currentAccount.getBalance()) {
                System.out.println("Withdrawing $" + amount);
                Data.currentAccount.updateBalance(-amount);
            } else {
                throw new NotEnoughMoneyException("Withdraw Failure");
            }
        } else {
            throw new WithdrawLimitException();
        }
        return Data.currentAccount.getBalance();
    }

    @Override
    public double checkBalance() {
        return Data.currentAccount.getBalance();
    }

    @Override
    public double deposit(double amount) {
        System.out.println("Adding $" + amount + "into" + Data.currentAccount.getAccountNumber());
        Data.currentAccount.updateBalance(amount);
        return Data.currentAccount.getBalance();
    }

    @Override
    public boolean transfer(long accountNumber, double amount) {
        for(Account each : Data.allAccounts) {
            if (each.getAccountNumber() == accountNumber) {
                if (Data.currentAccount.getBalance() >= amount) {
                    System.out.println("Transferring & " + amount + " to" + accountNumber);
                    each.updateBalance(amount);
                    Data.currentAccount.updateBalance(-amount);
                    return true;
                } else  {
                  throw new NotEnoughMoneyException("Cannot transfer $" + amount + " , not enough in balance");
                }
            }
        }
        throw new UserNotFoundException("Cannot transfer to this account");
    }

    @Override
    public void interfaceMenu(Scanner input) {
        if (!isPowerOn()) {
            throw new PowerNotFoundException();
        }
        if (Data.currentAccount == null) {
            System.out.println("Please log in first");
            return;
        }
        System.out.println("""
                            1) Check Balance
                            2) Deposit
                            3) Withdraw
                            4) Transfer
                            5) Logout""");

        switch (input.nextInt()) {
            case 1 -> System.out.println(checkBalance());
            case 2 -> {
                System.out.println("How much will you deposit?");
                deposit(input.nextDouble());
            }
            case 3 -> {
                System.out.println("How much will you withdraw?");
                withdraw(input.nextDouble());
            }
            case 4 -> {
                System.out.println("Please enter the account number you want to transfer to, and then please enter amount");
                transfer(input.nextLong(), input.nextDouble());
            }
            case 5 -> logout();
            default -> System.out.println("Not a valid option, Please try again");
        }
    }
}
