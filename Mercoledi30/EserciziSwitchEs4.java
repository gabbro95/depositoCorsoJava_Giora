import java.util.Scanner;

public class EserciziSwitchEs4 {
    public static void main(String[] args) {
        /* 
         * Scrivi un programma Java che stampa la stagione corrispondente a un dato mese utilizzando il blocco "switch".
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero della settimana: ");
        int numeroMese = scanner.nextInt();
        String stagione;

        switch (numeroMese) {
            case 12:
            case 1:
            case 2:
                stagione = "Inverno";
                break;
            case 3:
            case 4:
            case 5:
                stagione = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                stagione = "Estate";
                break;
            case 9:
            case 10:
            case 11:
                stagione = "Autunno";
                break;
            default:
                stagione = "Numero fuori range";
        }

        System.out.println("Il mese " + numeroMese + " corrisponde alla stagione: " + stagione + "!");
    }
}
