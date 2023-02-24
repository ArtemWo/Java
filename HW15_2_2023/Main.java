package HW_Java.Java.HW15_2_2023;

public class LoginAndPasswordChecker {
    public static void main(String[] args) {
 /*todo; Exceptions. Проверка логина и пароля
      Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
    Login должен содержать только латинские буквы, цифры и знак подчеркивания.
    Длина login должна быть меньше 20 символов.
    Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
    Password должен содержать только латинские буквы, цифры и знак подчеркивания.
    Длина password должна быть м /*еньше 20 символов. Также password и confirmPassword должны быть равны.
    Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
    WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
    второй принимает сообщение исключения и передает его в конструктор класса Exception.
    Обработка исключений проводится внутри метода.
    Используем multi-catch block. Метод возвращает true, если значения верны или false в другом случае.*/
        String login = "my_login";
        String password = "my_password";
        String confirmPassword = "my_password";
        System.out.println("dhsdhsd");
        boolean isValid = LoginValidator.check(login, password, confirmPassword);
        if (isValid) {
            System.out.println("Логин и пароль верны!");
        } else {
            System.out.println("Логин и пароль неверны!");
        }
    }
}

