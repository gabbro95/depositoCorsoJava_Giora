import java.util.Scanner; // Import the Scanner class

public class Iterazioni {
    public static void main(String[] args) {
        int i = 1;
        // Inizializzazione della variabile di controllo

        while (i <= 5) {
            i++;    // Incremento della variabile di controllo
            System.out.println(i);
        }

        System.out.println("Ciclo do-while");
        int k = 0;
        do {
            System.out.println("Numero: " + k);
            k++;
        } while (k < 5);

        // Ciclo Booleano
        boolean controllo = true;
        Scanner obj1 = new Scanner(System.in);
        while(controllo) {
            System.out.println("Vuoi continuare?");
            String x = obj1.nextLine();
            if (x.equals("no" ) || x.equals("stop" )) {
                controllo= false;
            }
        }
        obj1.close();

        // Ciclo For
        Scanner scanner1 = new Scanner(System.in);

        // Richiede un numero 
        System.out.print("Inserisci un numero: ");
        int numero = scanner1.nextInt();
        scanner1.close();

        // Stampa la tabellina del numero
        System.out.println("Tabellina del " + numero + ":");

        // Ciclo for per moltiplicare in numero da 1 a 10
        for (int c = 1; c <= 10; c++) {
            System.out.println(numero + " x " + c + " = " + (numero * c));
        }
    }
}
