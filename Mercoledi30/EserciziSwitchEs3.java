import java.util.Scanner; // Import the Scanner class

public class EserciziSwitchEs3 {
    public static void main(String[] args) {
        /* 
         * Scrivi un programma Java che calcola il numero di giorni in un dato mese
         * utilizzando il blocco "switch".
        */
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci l\' anno corrente': ");
        int anno = scanner.nextInt();
        System.out.print("Inserisci un numero del mese: ");
        int numeroMese = scanner.nextInt();
        int numeroGiorni;

        switch (numeroMese) {
            case 1:
                numeroGiorni = 31;
                break;
            case 2:
                boolean bisestile = (anno % 4 == 0 && anno % 100 != 0) || anno % 400 == 0;
                if (bisestile) numeroGiorni = 29;
                else numeroGiorni = 28;
                break;
            case 3:
                numeroGiorni = 31;
                break;
            case 4:
                numeroGiorni = 30;
                break;
            case 5:
                numeroGiorni = 31;
                break;
            case 6:
                numeroGiorni = 30;
                break;
            case 7:
                numeroGiorni = 31;
                break;
            case 8:
                numeroGiorni = 31;
                break;
            case 9:
                numeroGiorni = 30;
                break;
            case 10:
                numeroGiorni = 31;
                break;
            case 11:
                numeroGiorni = 30;
                break;
            case 12:
                numeroGiorni = 31;
                break;
            default:
                numeroGiorni = -1;
        }
        
        if (numeroGiorni < 0) System.out.println("Inserisci un numero da 1 a 12 corrispondente il mese!");
        else System.out.println("Il mese " + numeroMese + " ha: " + numeroGiorni + " giorni!");
    }
}
