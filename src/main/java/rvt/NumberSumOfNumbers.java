package rvt;

import java.util.Scanner;

public class NumberSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give the number: ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            count++;
            sum += number;
        }
        System.out.println("Numbers of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
        scanner.close();
    }
}