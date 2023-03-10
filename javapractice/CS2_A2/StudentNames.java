package CS2_A2;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class StudentNames{
  static final String pathOfStudentsFile = "D:\\java\\MyFirstProject\\src\\javapractice\\CS2_A2\\Students.txt";
  public static void main(String[] args) throws IOException{
//  get N number of students, and ask their names N times
    System.out.print("\n\n\n\nEnter the number of student names:\n>> ");
    Scanner sc = new Scanner(System.in);
    int numStudents = sc.nextInt();
//    Used ArrayList because it is mutable, and extra objects can be added
    ArrayList<String> list = new ArrayList<String>();
//    get the names of the students and append to the ArrayList
    for (int i=0; i<numStudents; i++){
      System.out.print("Enter the name of a student(no spaces):>> ");
      list.add(sc.next());
    }

//    Using Files-Path method to access the external File
    Path fileName = Paths.get(pathOfStudentsFile);
//    Sort the list in alphabetical order and print them out
    Collections.sort(list);
    System.out.println("\n*******All Names******\n");
    for (String n : list){
      System.out.println(n);
    }
//    write to the file the contents of the list(names)
    Files.write(fileName, list);
//    ask which name to remove
    System.out.print("\nWhich name to remove?\n>>");
    String name2Remove = sc.next();
    list.remove(name2Remove);
//    sort the list in reverse order
    Collections.reverse(list);
//    and write to the file
    Files.write(fileName, list);
//    read from the file
    String textInFile = Files.readString(fileName);
    System.out.println("*****Names in reverse order******");
    System.out.println(textInFile);
//    close the scanner, there is no need to close the file, because we only got the path to the file
    sc.close();
  }
}