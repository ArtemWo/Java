package org.example.HW1_03_23;

import java.io.*;

public class FileOperation {
    private File file;

    public FileOperation(String filename) {
        file = new File(filename);
    }

    public synchronized void writeToFile(String data) throws IOException {
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write(data);
            fw.flush();
        }
    }

    public synchronized String readFromFile() throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        }
        return sb.toString();
    }
}
