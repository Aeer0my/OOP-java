package Practice1;

import java.util.Scanner;

public class DisplayGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your grade: ");

        int grade = input.nextInt();
        input.close();

        if (grade < 50) {
            System.out.println("F");
        } else if (grade <= 54) {
            System.out.println("D");
        } else if (grade <= 59) {
            System.out.println("D+");
        } else if (grade <= 64) {
            System.out.println("C-");
        } else if (grade <= 69) {
            System.out.println("C");
        } else if (grade <= 74) {
            System.out.println("C+");
        } else if (grade <= 79) {
            System.out.println("B-");
        } else if (grade <= 84) {
            System.out.println("B");
        } else if (grade <= 89) {
            System.out.println("B+");
        } else if (grade <= 94) {
            System.out.println("A-");
        } else if (grade <= 100) {
            System.out.println("A");
        }

    }
}