package es4;
import java.util.Scanner;

public class es4 {
    public static void main (String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int numero = Scanner.nextInt();

        System.out.println("Conto alla rovescia:");

        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

        Scanner.close();
    }
}