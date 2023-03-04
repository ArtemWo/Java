package org.example.HW1_03_23;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
 /* todo Установить VisualVM, запустить, проверить, как отображаются
        пользовательские потоки в режиме работы, сна, ожидания
        потоки-демоны
        Запустить и посмотреть информацию о работе потоков в jstack
        Один поток обращается к файлу и записывает в него данные, второй поток
        открывает файл и выводит его содержимое на консоль.
        Реализовать потокобезопасным образом*/
        FileOperation fileOperation = new FileOperation("file.txt");


        Thread writerThread = new Thread(() -> {
            try {
                fileOperation.writeToFile("Hello, world!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });


        Thread readerThread = new Thread(() -> {
            try {
                String fileContent = fileOperation.readFromFile();
                System.out.println(fileContent);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });


        writerThread.start();
        readerThread.start();


        writerThread.join();
        readerThread.join();
    }
}
