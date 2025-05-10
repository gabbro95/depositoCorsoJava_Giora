import java.util.Scanner; // Import the Scanner class

class EserciziSwitchEs1 {
    public static void main(String[] args) {
        /*  
         * Scrivi un programma Java che stampa il nome del giorno della settimana
         * corrispondente a un numero utilizzando il blocco "switch".
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero della settimana: ");
        int numeroGiorno = scanner.nextInt();
        String nomeGiorno;

        switch (numeroGiorno) {
            case 1:
                nomeGiorno = "Lunedì";
                break;
            case 2:
                nomeGiorno = "Martedì";
                break;
            case 3:
                nomeGiorno = "Mercoledì";
                break;
            case 4:
                nomeGiorno = "Giovedì";
                break;
            case 5:
                nomeGiorno = "Venerdì";
                break;
            case 6:
                nomeGiorno = "Sabato";
                break;
            case 7:
                nomeGiorno = "Domenica";
                break;
            default:
                nomeGiorno = "Numero non valido";
        }

        System.out.println("Il numero inserito " + numeroGiorno + " corrisponde al giorno della settimana: " + nomeGiorno + "!");
    }
}
