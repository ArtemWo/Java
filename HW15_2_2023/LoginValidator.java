package HW_Java.Java.HW15_2_2023;

public class LoginValidator {
           public static boolean check(String login, String password, String confirmPassword) {
            try {
                if (login.length() >= 20 || !login.matches("[a-zA-Z0-9_]+")) {
                    throw new WrongLoginException();
                }
                if (password.length() >= 20 || !password.matches("[a-zA-Z0-9_]+") || !password.equals(confirmPassword)) {
                    throw new WrongPasswordException();
                }
                return true;
            } catch (WrongLoginException | WrongPasswordException e) {
                System.out.println(e.getMessage());
                return false;
            }
        }
}
