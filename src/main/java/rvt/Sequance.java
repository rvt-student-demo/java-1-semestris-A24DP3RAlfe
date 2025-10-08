package rvt;

import java.util.Scanner;

public class Sequance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number? ");
        int lastNumber = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= lastNumber; i++) {
            sum += i;
        }
        System.out.println("Sum is " + sum);
        scanner.close();
    }
}

