package rvt;

import java.util.Scanner;

public class PasutijumaParbauditajs {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Skruvju skaits: ");
    int skruves = scanner.nextInt();

    System.out.print("Uzgrieznu skaits: ");
    int uzgriezni = scanner.nextInt();
    
    System.out.print("Paplaksnu skaits: ");
    int paplaksnes = scanner.nextInt();
        int skruvesCena = 5;
        int uzgriezniCena = 3;
        int paplaksnesCena = 1;

        System.out.println("Pārbaudi pasūtijmu: ");
        if (skruves < uzgriezni) {
            System.out.println("Par maz uzgrieznu");
        } else if (skruves < paplaksnes) {
            System.out.println("Par maz paplaksnu");
        }
        System.out.println("Kopēja cena: " + (skruves * skruvesCena + uzgriezni * uzgriezniCena + paplaksnes * paplaksnesCena));
        scanner.close();
    }
}
