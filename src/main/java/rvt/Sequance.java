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


public class TheSequel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number? ");
        int first = scanner.nextInt();

        System.out.println("Last number? ");
        int last = scanner.nextInt();

        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
        scanner.close();
    }
}