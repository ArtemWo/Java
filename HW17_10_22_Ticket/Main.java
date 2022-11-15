package HW_Java.HW17_10_22_Ticket;


public class Main {
    public static void main(String[] args) {
    /* todo     1.  	Представьте, вы пишите программу для автопарка или, например, для авиакомпании. Вам необходимо
         создать класс Ticket, который должен содержать следующие поля Route route, MyDateTime time, double price.
         Как вы догадываетесь, Route и MyDateTime тоже  классы: Route{String number, String  from, String destination,
        long distance}  MyDateTime (day,month,year,hour,min). Далее вам необходимо:
         a) создать несколько разных билетов, положить их в массив.
         b) Реализовать метод, который выводит информацию обо всех билетах
         c) Реализовать метод, который считает суммарную стоимость билетов.
         d) Необходимо посчитать суммарную дистанцию всех маршрутов (предположим, что у вас нет билетов с одним
            и тем же маршрутом, т.е. задача сводится к простому суммированию всех distance)
         e)Реализовать в билете метод изменения времени отправления.*/

        Ticket ticket1 = new Ticket(new HW.HW17_10_22_Ticket.MyDateTime(25, "November", 2022, 9, 35),
                new HW.HW17_10_22_Ticket.Route(23, "Stuttgart", "Ulm", 120), 25);

        System.out.println(ticket1);


        Ticket[] tickets = {ticket1, new Ticket(new HW.HW17_10_22_Ticket.MyDateTime(25, "November", 2022, 9, 35),
                new HW.HW17_10_22_Ticket.Route(23, "Stuttgart", "Ulm", 120), 55),
                new Ticket(new HW.HW17_10_22_Ticket.MyDateTime(10, "November", 2022, 23, 3),
                        new HW.HW17_10_22_Ticket.Route(13, "Berlin", "Ulm", 1320), 21),
                new Ticket(new HW.HW17_10_22_Ticket.MyDateTime(2, "November", 2022, 19, 335),
                        new HW.HW17_10_22_Ticket.Route(14, "Stuttgart", "Bremen", 1230), 35),
                new Ticket(new HW.HW17_10_22_Ticket.MyDateTime(22, "Hamburg", 2022, 10, 00),
                        new HW.HW17_10_22_Ticket.Route(29, "Wiesbaden", "Holstein", 1120), 255)};


        for (Ticket x : tickets) {
            System.out.println("=======================================================================================");
            System.out.println(x);

        }

    }

}
