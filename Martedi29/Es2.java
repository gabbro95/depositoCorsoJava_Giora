import java.util.Scanner; // Import the Scanner class

public class Es2 {
    public static void main(String[] args) {
        int numero = 10;    // Numero da indovinare

        Scanner scanner = new Scanner(System.in); // Create a scanner object
        
        System.out.println("Inserisci un numero per indovinare!");  // inserire numero da indovinare
        int search = scanner.nextInt(); // Read numero input
        
        if (search == numero) {
            System.out.println("Hai indovinato il numero!");
        } else if (search < numero) {
            System.out.println("Il numero è piu basso!");
        } else if (search > numero) {
            System.out.println("Il numero è piu alto!");
        } else {
            System.out.println("Ritenta!");
        }
        
    }
}
