
import java.util.*;

public class GradeCalculator {
    public static String grade(int avg) {
        String grade;
        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("average: ");
            int avg = scan.nextInt();

            System.out.println(avg + " = " + grade(avg));
        }
    }
}
