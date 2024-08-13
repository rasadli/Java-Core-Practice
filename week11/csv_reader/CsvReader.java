package week11.csv_reader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    public static List<Person> readCsv(String filePath) {
        List<Person> people = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            bufferedReader.readLine();

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0].trim());
                String firstName = data[1].trim();
                String lastName = data[2].trim();
                int age = Integer.parseInt(data[3].trim());
                people.add(new Person(id, firstName, lastName, age));
            }
        } catch (IOException | NumberFormatException ex) {
            ex.printStackTrace();
        }
        return people;
    }

    public static void WriteCsv(List<Person> people, String filePath) {
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            for (Person person : people) {
                fileWriter.write(person.getId() + "," + person.getFirstName() + "," + person.getLastName() + "," + person.getAge() + "\n");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String inputCsv = "C:/Users/resad/Desktop/Rashad/ADA/Spring2024/Programing Principles 2/practical-work-rasadli/week11/csv_reader/input.csv";
        List<Person> people = readCsv(inputCsv);

        if (!people.isEmpty()) {
            int sumAge = people.stream().mapToInt(Person::getAge).sum();
            double averageAge = sumAge / (double) people.size();

            List<Person> belowAverage = new ArrayList<>();
            List<Person> aboveAverage = new ArrayList<>();

            for (Person p : people) {
                if (p.getAge() < averageAge) {
                    belowAverage.add(p);
                } else {
                    aboveAverage.add(p);
                }
            }

            WriteCsv(belowAverage, "C:/Users/resad/Desktop/Rashad/ADA/Spring2024/Programing Principles 2/practical-work-rasadli/week11/csv_reader/below_average.csv");
            WriteCsv(aboveAverage, "C:/Users/resad/Desktop/Rashad/ADA/Spring2024/Programing Principles 2/practical-work-rasadli/week11/csv_reader/above_average.csv");

            System.out.println("Average Age: " + averageAge);
        }
    }
}
