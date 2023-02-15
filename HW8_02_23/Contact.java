
package HW_Java.Java.HW8_02_23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Contact implements Serializable {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private String email;
    private String website;

    public Contact(String firstName, String lastName, String phoneNumber, String address, String email, String website) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.website = website;
    }

    // Геттеры и сеттеры
    // ...

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n" +
                "Phone: " + phoneNumber + "\n" +
                "Address: " + address + "\n" +
                "Email: " + email + "\n" +
                "Website: " + website;
    }

    public static <U extends Comparable<? super U>, T> U getPhoneNumber(T t) {
        return null;
    }
}

class ContactReader {
    private String filename;

    public ContactReader(String filename) {
        this.filename = filename;
    }

    public List<Contact> readContacts() throws IOException {
        List<Contact> contacts = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            String firstName = line.trim();
            String lastName = reader.readLine().trim();
            String phoneNumber = reader.readLine().trim();
            String address = reader.readLine().trim();
            String email = reader.readLine().trim();
            String website = reader.readLine().trim();
            contacts.add(new Contact(firstName, lastName, phoneNumber, address, email, website));
        }
        reader.close();
        return contacts;
    }
}