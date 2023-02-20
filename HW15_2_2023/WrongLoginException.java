package HW_Java.Java.HW15_2_2023;

public class WrongLoginException extends Exception {
    public  WrongLoginException(){
        super("неверный логин");
    }
    public WrongLoginException(String message){
        super(message);
    }
}
