package rvt;
import java.util.ArrayList;
import java.util.Scanner;
public class JMArrayLists {
    public static void main(String[] args) {

    }
    public static void OnlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while(true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == -1) {
                break;
            }
            numbers.add(num);
        }

        System.out.println("From where?");
        int start = Integer.parseInt(scanner.nextLine());

        System.out.println("To where?");
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end; i++) {
            System.out.println(numbers.get(i));
        }
        scanner.close();
        }

        // public static void LastSize() {
        //     Scanner scanner = new Scanner(System.in);
        //     ArrayList<String> list = new ArrayList<>();

        //     while(true) {
        //         String input = scanner.nextLine();

        //         if (input.isEmpty()) {
        //             break;
        //         }
        //         list.add(input);
        //     }
        //     System.out.println("In total: " + list.size());
        //     scanner.close();

        // }

        // public static void OnTheList() {
        //     Scanner scanner = new Scanner (System.in);
        //     ArrayList<String> list = new ArrayList<>();

        //     while (true) {
        //         String input = scanner.nextLine();

        //         if (input.isEmpty()) {
        //             break;
        //         }
        //         list.add(input);
        //     }
        //     System.out.println("Search for?");
        //     String search = scanner.nextLine();
        //     if (list.contains(search)) {
        //         System.out.println(search + " was found!");
        //     } else {
        //         System.out.println(search + " was not found!");
        //     }
        //     scanner.close();
        // }

        // public static void removeLast() {
        //     if (strings.isEmpty()) {
        //         return;
        //     }
        //     int LastIndex = strings.size() - 1;
        //     strings.remove(LastIndex);
        //     scanner.close();
        //}
}
