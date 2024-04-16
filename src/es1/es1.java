package es1;
import java.util.Scanner;

public class es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input della stringa
        System.out.print("Inserisci una stringa: ");
        String inputString = scanner.nextLine();
        boolean isEvenLength = stringaPariDispari(inputString);
        System.out.println("La lunghezza della stringa è pari? " + isEvenLength);

        // Input dell'anno
        System.out.print("Inserisci un anno: ");
        int anno = scanner.nextInt();
        boolean isBisestile = annoBisestile(anno);
        System.out.println("L'anno " + anno + " è bisestile? " + isBisestile);

        scanner.close();
    }

    public static boolean stringaPariDispari(String str) {
        return str.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
        return (anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0);
    }
}