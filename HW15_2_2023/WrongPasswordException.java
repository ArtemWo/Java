package HW_Java.Java.HW15_2_2023;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(){
        super("неверный пороль");
            }
    public WrongPasswordException(String message) {
        super(message);
    }
}
