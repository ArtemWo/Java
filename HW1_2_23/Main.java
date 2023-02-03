package HW_Java.Java.HW1_2_23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //todo   1. Создайте файл, используя FileOutputStream, с текстом:
        // "This is my first experience when I myself work with IO API. I can do everything!"

        try {
            FileOutputStream ff1 = new FileOutputStream("ff1.txt");
            String text = "This is my first experience when I myself work with IO API. I can do everything!";
            ff1.write(text.getBytes());
            ff1.close();
            System.out.println("File created!");
        } catch (IOException e) {
            System.out.println("error ");
            e.printStackTrace();
        }
    }
}
