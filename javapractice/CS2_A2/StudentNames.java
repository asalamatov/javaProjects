package CS2_A2;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class StudentNames{
  public static void main(String[] args) throws IOException{
    System.out.print("\n\n\n\nEnter the number of student names:\n>> ");
    Scanner sc = new Scanner(System.in);
    int numStudents = sc.nextInt();
    String[] namesArray = new String[numStudents];

    for (int i=0; i<numStudents; i++){
      System.out.print("Enter the name of a student:>> ");
      namesArray[i] = sc.next();
    }

    Path fileName = Path.of("Students.txt");
    Arrays.sort(namesArray);
    StringBuffer sb = new StringBuffer();
    System.out.println("\n*******All Names******\n");
    for (String n : namesArray){
      System.out.println(n);
      sb.append(n+"\n");
      
    }
    Files.writeString(fileName, sb.toString());

    System.out.print("\nWhich name to remove?\n>>");
    String name2Remove = sc.next();
    name2Remove+="\n";
    String temp = sb.toString().replaceAll(name2Remove, "");
    StringBuffer sb1 = new StringBuffer(temp);
    Files.writeString(fileName, sb1.reverse().toString());

    String textInFile = Files.readString(fileName);
    System.out.println("*****Names in revers order******");
    System.out.println(textInFile);
  }

  
}