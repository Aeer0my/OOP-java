package Practice1;

import java.util.Scanner;

public class CalculateArea2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a:");

        long a = input.nextInt();

        input.close();

        long area = a * a;
        long perimeter = a * 4;
        double diagonal = (double)a * Math.sqrt((double)2.0F);

        System.out.printf("Area: " + area + "\nPerimeter: " + perimeter + "\nDiagonal: " + diagonal);
    }
}
