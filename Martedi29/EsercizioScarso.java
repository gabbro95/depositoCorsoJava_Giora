
import java.util.Scanner; // Import the Scanner class

public class EsercizioScarso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner object
        
        // Legge in input
        System.out.println("Inserisci il primo numero");  // inserire valore
        final int numero1 = scanner.nextInt(); // Read user input
        System.out.println("Inserisci il secondo numero");  
        final int numero2 = scanner.nextInt(); 

        scanner.close();

        // Operazioni
        int somma = numero1 + numero2;
        int differenza = numero1 - numero2;
        int prodotto = numero1 * numero2;

        // Stampa a schermo
        System.out.println("Somma: "+somma);
        System.out.println("Differenza: "+differenza);
        System.out.println("Prodotto: "+prodotto);
    }
}
