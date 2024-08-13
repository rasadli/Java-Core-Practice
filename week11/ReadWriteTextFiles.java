package week11;

import java.io.*;

public class ReadWriteTextFiles {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("sample.txt")) {
            fileWriter.write("Example for using FileWriter");
        } catch (IOException ex) {
            System.err.println("Error while writing to file: " + ex.getMessage());
        }

        //  with FileReader
        try (FileReader fileReader = new FileReader("sample.txt")) {
            int c;
            StringBuilder sb = new StringBuilder();
            while ((c = fileReader.read()) != -1) {
                sb.append((char) c);
            }
            System.out.println("Content read using read()");
            System.out.println(sb.toString());
        } catch (IOException ex) {
            System.err.println("Error reading from file: " + ex.getMessage());
        }

        // with read(char[]) method
        try (FileReader fileReader = new FileReader("sample.txt")) {
            char[] buffer = new char[1024];
            StringBuilder sb = new StringBuilder();
            int charsRead;
            while ((charsRead = fileReader.read(buffer)) != -1) {
                sb.append(buffer, 0, charsRead);
            }
            System.out.println("Content read using read(char[]) method");
            System.out.println(sb.toString());
        } catch (IOException ex) {
            System.err.println("Error reading from file: " + ex.getMessage());
        }
    }
}
