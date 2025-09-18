package rvt;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Give the secnd number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Give the third number: ");
        double num3 = scanner.nextDouble();

        double average = (num1 + num2 + num3) / 3.0;

        System.out.println("The average is: " + average);
        scanner.close();
    }
}