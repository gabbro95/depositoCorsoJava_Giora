import java.util.Scanner;

public class VotiTester {
    public static void main(String[] args) {
        boolean run = true; // stato applicazione

        // Avvia applicazione
        while (run) {
            // Istanzia le classi
            Voti voto = new Voti();
            Scanner in = new Scanner(System.in);

            // Riceve l' input
            System.out.print("Inserire un voto A, B, C, D e F, eventualmente seguite dai segni + o -, Q per terminare: ");
            String input = in.nextLine();
            in.close();

            if (input.equalsIgnoreCase("Q")) {
                // Termina l'applicazione
                run = false;
            } else {
                // Stampa il voto convertito
                System.out.println(voto.getNumericGrade(input));
            }
        }
    }
}
