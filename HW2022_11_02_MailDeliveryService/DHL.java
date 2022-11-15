package HW_Java.HW2022_11_02_MailDeliveryService;

public class DHL implements MailDeliveryService {
    public boolean sendMail(double letterDeliveryMethod) {
        String str1 = "Положи письмо в конверт";
        String str2 = "Наклей марку";
        String str3 = "Отправь";
        System.out.println( str1 + ",  " + str2 + ",  " + str3);
        return true;
    }
}

