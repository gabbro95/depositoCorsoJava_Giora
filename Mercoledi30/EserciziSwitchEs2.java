import java.util.Scanner; // Import the Scanner class

public class EserciziSwitchEs2 {
    public static void main(String[] args) {
        /* 
         * Scrivi un programma Java che stampa il mese corrispondente a un numero
         * utilizzando il blocco "switch".
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il numero del: ");
        int numeroMese = scanner.nextInt();
        String nomeMese;

        switch (numeroMese) {
            case 1:
                nomeMese = "Gennaio";
                break;
            case 2:
                nomeMese = "Febbraio";
                break;
            case 3:
                nomeMese = "Marzo";
                break;
            case 4:
                nomeMese = "Aprile";
                break;
            case 5:
                nomeMese = "Maggio";
                break;
            case 6:
                nomeMese = "Giugno";
                break;
            case 7:
                nomeMese = "Luglio";
                break;
            case 8:
                nomeMese = "Agosto";
                break;
            case 9:
                nomeMese = "Settembre";
                break;
            case 10:
                nomeMese = "Ottobre";
                break;
            case 11:
                nomeMese = "Novermbre";
                break;
            case 12:
                nomeMese = "Dicembre";
                break;
            default:
                nomeMese = "Numero non valido";
        }
        
        System.out.println("Il numero inserito " + numeroMese + " corrisponde al mese di: " + nomeMese + "!");
    }
}
