package Practice1;

import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sqrt2 = Math.sqrt((double)2.0F);

        System.out.println("Enter a:");



        int a = input.nextInt();

        input.close();

        if(a==0){
            System.out.println("a cannot be 0");
        }
        int area = a * a;
        int perimeter = a * 4;
        double diagonal = (double)a * sqrt2;

        System.out.printf("Area: " + area + "\nPerimeter: " + perimeter + "\nDiagonal: " + diagonal);
    }
}
