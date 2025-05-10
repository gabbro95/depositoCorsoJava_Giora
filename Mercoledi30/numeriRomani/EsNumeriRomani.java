package numeriRomani;
import java.util.Scanner;

public class EsNumeriRomani {
    public static void main(String[] args) {
        boolean run = true;     // Avvio programma

        while(run) {
            NumeriRomani romani = new numeriRomani.NumeriRomani();
            Scanner scannerMenu = new Scanner(System.in);
            System.out.println("");
            System.out.print("Scegli cosa fare, digita il numero relativo alla scelta!\n"+ 
                "1. Converte un numero romano in decimale\n"+
                "2. Numero romano corrispondente a un numero decimale\n"+
                "3. Esci\n\n"+
                "Scelta: ");
            int scelta = scannerMenu.nextInt();

            switch (scelta) {
                case 1:
                    Scanner scannerMenu1 = new Scanner(System.in);
                    System.out.print("Ricerca la lettera Romana: ");
                    romani.numeroRomano = scannerMenu1.nextLine();
                    romani.ricerca_numero_romano();
                    System.out.println("");
                    System.out.println("Il valore della lettera " + romani.numeroRomano + " in decimale: "+ romani.numeroDecimale + "!");
                    break;
                case 2:
                    Scanner scannerMenu2 = new Scanner(System.in);
                    System.out.print("Digita un valore numerico intero: ");
                    romani.converteDecimale = scannerMenu2.nextInt();
                    romani.converti_decimale_romano();
                    System.out.println("Il numero decimale " + romani.converteDecimale + " corrisponde al numero romano: " + romani.numeroRomano + "!");
                    break;
                case 3:
                    System.out.println("Chisura applicazione!");
                    run = false;
                    break;
            
                default:
                    break;
            }

        }
    }
}
