package rvt;

import java.util.Scanner;

public class Delikatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadi preci: ");
        String prece = scanner.nextLine();

        System.out.print("Ievadi cenu: ");
        double cena = scanner.nextDouble();

        System.out.print("Eksperss peigade (0==ne, 1==ja): ");
        int ekspress = scanner.nextInt();

        double piegade = 2.5;
        if (ekspress == 1) {
            cena = cena + piegade;
        }
        System.out.println("Rekins: ");
        System.out.println("Prece: " + prece);
        System.out.println("piegade: " + piegade);
        System.out.println("Kopa: " + (cena));
        scanner.close();
    }
}