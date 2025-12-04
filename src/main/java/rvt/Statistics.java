package rvt;

import java.util.Scanner;

public class Statistics {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    StatsData allnumbers = new StatsData();
    StatsData evennumbers = new StatsData();
    StatsData oddnumbers = new StatsData();

    System.out.println("Enter numbers:");

    while (true) {
        int number = Integer.parseInt(scanner.nextLine());
        if (number == -1) {
            break;
        }
        allnumbers.addNumber(number);
        if (number % 2 == 0) {
            evennumbers.addNumber(number);
        } else {
            oddnumbers.addNumber(number);
        }
    }
    System.out.println("Sum: " + allnumbers.sum());
    System.out.println("Sum of even numbers: " + evennumbers.sum());
    System.out.println("Sum of odd numbers: " + oddnumbers.sum());
    scanner.close();
}

static class StatsData {
    private int count;
    private int sum;

    public StatsData() {
        this.count = 0;
        this.sum = 0;
    }
    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.count == 0) {
            return 0;
        }
        return (double) this.sum / this.count;
    }
}
}