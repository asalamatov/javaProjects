package CS2_A2;

import java.io.*;
import java.util.*;

public class StudentNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of names to input from the user
        System.out.print("Enter the number of names: ");
        int numNames = scanner.nextInt();

        // Create an array to hold the names
        String[] names = new String[numNames];

        // Get the names from the user
        System.out.println("Enter the names:");
        for (int i = 0; i < numNames; i++) {
            names[i] = scanner.next();
        }

        // Sort the names
        Arrays.sort(names);

        // Write the names to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Students.txt"))) {
            for (String name : names) {
                writer.write(name);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Ask the user which name to eliminate
        System.out.print("Enter a name to eliminate: ");
        String nameToEliminate = scanner.next();

        // Eliminate the name from the file
        try (BufferedReader reader = new BufferedReader(new FileReader("Students.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("StudentsModified.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.equals(nameToEliminate)) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading/writing file: " + e.getMessage());
        }

        // Read the modified file and output the names in reverse alphabetical order
        try (BufferedReader reader = new BufferedReader(new FileReader("StudentsModified.txt"))) {
            List<String> reversedNames = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                reversedNames.add(line);
            }
            Collections.sort(reversedNames, Collections.reverseOrder());
            System.out.println("Names in reverse alphabetical order:");
            for (String name : reversedNames) {
                System.out.println(name);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

