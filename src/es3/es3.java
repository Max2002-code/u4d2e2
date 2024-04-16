package es3;
import java.util.Scanner;

public class es3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString;
        while (true) {
            System.out.print("Inserisci una stringa (usa ':q' per uscire): ");
            inputString = scanner.nextLine();

            if (inputString.equals("q")) {
                System.out.println("Arrivederci!");
                break;
            }

            // Suddivide la stringa in caratteri separati dalla virgola
            String[] caratteri = inputString.split("");
            for (int i = 0; i < caratteri.length; i++) {
                System.out.print(caratteri[i]);
                if (i < caratteri.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
