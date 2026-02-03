package Practice1;

import java.util.Scanner;

public class QuadraticEquations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a: ");
        long a = input.nextInt();
        System.out.println("Enter b: ");
        long b = input.nextInt();
        System.out.println("Enter c: ");
        long c = input.nextInt();

        input.close();

        double D = (double)(b * b - 4 * a * c);
        double x1 = (double)(-b) + Math.sqrt(D) / (double)(2 * a);
        double x2 = (double)(-b) - Math.sqrt(D) / (double)(2 * a);

        if (D < (double)0.0F) {
            System.out.println("D is negative");
        } if (D==0.0D) {
            System.out.println("D is zero");
        } else {
            System.out.println("x1 = " + x1 + "\nx2 = " + x2);
        }

    }
}