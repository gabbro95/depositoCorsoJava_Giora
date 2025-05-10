import java.util.Scanner; // Import the Scanner class

public class Esercizio {
    public static void main(String[] args) {
        final float prezzoBase = 500;
        float prezzoFinale = 0;

        Scanner scanner = new Scanner(System.in); // Create a scanner object
        
        System.out.println("Inserisci la tua età!");  // Inserimento
        int eta = scanner.nextInt(); // Lettura inserimento
        System.out.println("Inserisci i tuoi anni di esperienza alla guida!");  // Inserimento
        int anniEsperienza = scanner.nextInt(); // Lettura inserimento
        System.out.println("Inserisci il numero di incidenti nella tua carriera!");  // Inserimento
        int numeroIncidenti = scanner.nextInt(); // Lettura inserimento
        
        if (eta < 18) {
            System.out.println("Non sei idoneo per l'assicurazione");
        } else if ((eta > 18) && ((eta > 25))) {
            prezzoFinale += prezzoBase * 0.20;
        } else if (eta > 50) {
            prezzoFinale -= prezzoBase * 0.10;
        }

        if (anniEsperienza < 2) {
            prezzoFinale += prezzoBase * 0.30;
        }

        if (numeroIncidenti < 4) {
            if (numeroIncidenti == 1) {
                prezzoFinale += prezzoBase * 0.15;
            } else if (numeroIncidenti >= 2) {
                prezzoFinale += prezzoBase * 0.30;
            } 
        } else {
            System.out.println("Non sei idoneo alla guida");
        }

        System.out.println("Inserisci il pacchetto Base, Intermedio, Premium");  // Inserimento
        String pacchetto = scanner.nextLine(); // Lettura inserimento
        

        switch (pacchetto) {
            case "Base":
                break;
            case "Intermedio":
                prezzoFinale += prezzoBase * 0.20;
                break;
            case "Premium":
                prezzoFinale += prezzoBase * 0.50;
                break;
        }

        System.out.print("Il preventivo è di: ");
        System.out.println(prezzoFinale + "$");

        scanner.close();
    }
}
