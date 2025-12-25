import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        // Console Design
        System.out.println("==================================");
        System.out.println("       STUDENT GRADE TRACKER       ");
        System.out.println("==================================");

        // Input
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            grades.add(sc.nextInt());
        }

        // Calculation
        int total = 0;
        int highest = grades.get(0);
        int lowest = grades.get(0);

        for (int mark : grades) {
            total += mark;

            if (mark > highest) {
                highest = mark;
            }

            if (mark < lowest) {
                lowest = mark;
            }
        }

        double average = (double) total / n;

        // Summary Report
        System.out.println("\n--------- SUMMARY REPORT ---------");
        System.out.println("Total Students : " + n);
        System.out.println("Average Score  : " + average);
        System.out.println("Highest Score  : " + highest);
        System.out.println("Lowest Score   : " + lowest);
        System.out.println("---------------------------------");

        sc.close();
    }
}