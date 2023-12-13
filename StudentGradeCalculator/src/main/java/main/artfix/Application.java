package main.artfix;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    private static boolean howManyGradesCalculate = true;
    private static ArrayList<Integer> grades = new ArrayList<>();
    public static void start(){
        while (howManyGradesCalculate) {
            System.out.print("Enter your grades (when done type 'end'): ");
            Scanner scanGradesIn = new Scanner(System.in);
            String scanGrades = scanGradesIn.nextLine();

            if (scanGrades.equals("end") || scanGrades.equals("End")) {
                howManyGradesCalculate = false;
                break;
            }
            grades.add(Integer.parseInt(scanGrades));
        }
        int gradesLength = grades.size();
        int sum = grades.stream().mapToInt(Integer::intValue).sum();

        float result = (float) sum / gradesLength;
        System.out.println("Your year mark is:  " + result);
    }
}
