package rvt;

import java.util.Scanner;

public class Chapter44 {
    public static void man(String[] args){

    }
        public static void ex1() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String input = sc.nextLine().trim();
            int idx = input.indexOf(" ");
            if (idx > 0) {
                String first = input.substring(0, idx);
                String last = input.substring(idx + 1).toUpperCase();
                System.out.println();
                System.out.println(first + " " + last);
            } else {
                System.out.println();
                System.out.println(input);
            }
        }
        public static void ex2() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = sc.nextLine();
            System.out.println();
            for (int i = 0; i < input.length(); i++) {
                System.out.println(input.charAt(i));
            }
        }
        public static void ex3() {
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.print("Enter a name: ");
                String input = sc.nextLine().trim();
                if (input.length() == 0) {
                    break;
                }
                String lower = input.toLowerCase();
                System.out.println();
                if (lower.startsWith("amy") || lower.startsWith("buffy") || lower.startsWith("cathy")) {
                    System.out.println("Ms. " + input);
                } else if (lower.startsWith("elroy") || lower.startsWith("fred") || lower.startsWith("graham")) {
                    System.out.println("Mr. " + input);
                } else {
                    System.out.println(input);
                }
                System.out.println();
            }
        }
        public static void ex4() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter cook time-> ");
            String input = sc.nextLine().trim();

            int minutes = 0;
            int seconds = 0;

            if (input.length() == 0) {
            } else {
                try {
                    if (input.length() <= 2) {
                        seconds = Integer.parseInt(input);
                    } else {
                        String minsPart = input.substring(0, input.length() - 2);
                        String secsPart = input.substring(input.length() - 2);
                        minutes = Integer.parseInt(minsPart);
                        seconds = Integer.parseInt(secsPart);
                    }
                } catch (NumberFormatException e) {
                    System.out.println();
                    System.out.println("Invalid input. Please enter only digits.");
                    return;
                }
            }

            String secFormatted = String.format("%02d", seconds);
            System.out.println();
            System.out.println("Your time->  " + minutes + ":" + secFormatted);
        }
        public static void ex5() {
            
        }
        public static void ex6() {}
        public static void ex7() {}
}
