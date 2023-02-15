package HW_Java.Java.HW8_02_23;
import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*  todo Описание занятия: распарсить файл inputbuisnesscard.txt
           создать класс типа Contact и сопутствующие классы при необходимости
           заполнить обьекты типа Contact данными из файла(
                   Имя \ Фамилия
                   Телефон
                   Адрес
                   Емэйл
                   Вебсайт
           вывести в консоль список контактов отсортированных по № телефона
           факультативно:
           используя интерфейс Serializable сохранить обьекты типа  Contact в файл
           реализовать считывание и выдачу в консоль сохраненых обьектов*/

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ContactReader reader = new ContactReader("input_business_card.txt");
        List<Contact> contacts = reader.readContacts();
        Collections.sort(contacts, Comparator.comparing(Contact::getPhoneNumber));
        for (Contact contact : contacts) {
            System.out.println(contact);
        }

        // Сохранение объектов в файл
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("contacts.ser"));
        objectOutputStream.writeObject(contacts);
        objectOutputStream.close();

        // Чтение сохраненных объектов и вывод в консоль
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("contacts.ser"));
        List<Contact> savedContacts = (List<Contact>) objectInputStream.readObject();
        objectInputStream.close();
        for (Contact savedContact : savedContacts) {
            System.out.println(savedContact);
        }
    }
}












