package rvt;

import java.util.Scanner;

public class SimpleCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ievadiet pirmo skaitli: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ievadiet otro skaitli: ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            double difference = num1 - num2;
            double product = num1 * num2;
            double quotient = 1 * num1 / num2;
            System.out.println("Summa: " + sum);
            System.out.println("Starpība: " + difference);
            System.out.println("Reizinājums: " + product);
            System.out.println("Dalījums: " + quotient);
            scanner.close();
        }
}
