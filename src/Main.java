import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.*;

public class Main {
    public static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        int input = 0;

        do {
            System.out.print("\n1) Inserisci numeri da codificare in Binario!");
            System.out.print("\n2) Esci");
            System.out.print("\n");
            System.out.print("\nScelta: ");
            input = in.nextInt();

            switch (input) {
                case 1:
                    System.out.print("\nInserisci Stringa: ");
                    String inString = in.next();
                    ConvertitoreInBinario convertitoreInBinario = new ConvertitoreInBinario();
                    convertitoreInBinario.getWriteToFile(convertitoreInBinario.getConvertToBinary(inString));
                    System.out.print("\nI tuoi dati sono stati salvati nel file CodificaBinario.txt.");
                    break;
                default:
                    input = 2;
            }
        } while (input < 2);
    }
}