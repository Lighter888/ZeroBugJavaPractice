package Maksim.ATM_project.Exceptions;

public class NotEnoughMoneyException extends RuntimeException{

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
