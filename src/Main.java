import java.util.*;
import java.io.*;
import java.net.*;

public class Main {
    public static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        int input = 0;

        do {
            System.out.print("\n1) Inserisci numeri da codificare in Binario!");
            System.out.print("\n2) Inserisci file con i numeri Binari da decodificare!");
            System.out.print("\n3) Esci");
            System.out.print("\nScelta: ");
            input = in.nextInt();

            switch (input) {
                case 1:
                    System.out.print("\nInserisci Stringa: ");
                    String inString = in.next();
                    ConvertitoreInBinario convertitoreInBinario = new ConvertitoreInBinario(inString);
                    convertitoreInBinario.getWriteToFile();

                    System.out.print("\nI tuoi dati sono stati salvati nel file CodificaBinario.txt.");
                    break;
                default:
                    input = 3;
            }
        } while (input < 3);
    }
}