package HW_Java.HW2022_11_02_MailDeliveryService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Каким способом хотели бы Вы отправить письмо?");
        System.out.println("1. Airmail");
        System.out.println("2. Internet");
        System.out.println("3. Голубинныя почта");

        MailDeliveryService mailDeliveryService = null;
        Scanner console = new Scanner(System.in);
        int dialogue = console.nextInt();
        switch (dialogue) {
            case 1:
                getMail(new DHL());
                break;
            case 2:
                getMail(new Email());
                break;
            case 3:
                getMail(new Pigeon());
        }
        if (mailDeliveryService != null) {
            getMail(mailDeliveryService);
        }
    }

    public static void getMail(MailDeliveryService mailDeliveryService) {

        mailDeliveryService.sendMail(2);
    }
}

