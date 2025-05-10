package Venerdi0905;
import java.io.*;

public class ProgAlbero {
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader tastiera = new BufferedReader(input);
    Albero a;

    public ProgAlbero() {
        int scelta;

        // crea l' albero vuoto
        a = new Albero();

        do {
            System.out.println();
            System.out.println("***** MENU *****");
            System.out.println("1) Aggiunta di un dato");
            System.out.println("2) Eliminazione di un dato");
            System.out.println("3) Ricerca di un dato");
            System.out.println("4) Stampa ordinata");
            System.out.println("5) Stampa in preordine");
            System.out.println("6) Stampa in postordine");
            System.out.println("\n0) Fine\n");
            System.out.print("Scelta: ");

            try {
                scelta = Integer.valueOf(tastiera.readLine()).intValue();
            } catch(Exception e) {
                scelta = 10;
            }

            switch (scelta) {
                case 0:
                    break;
                case 1:
                    aggiunta();
                    break;
                case 2:
                    eliminazione();
                    break;
                case 3:
                    ricerca();
                    break;
                case 4:
                    a.stampaInordine();
                    break;
                case 5:
                    a.stampaPreordine();
                    break;
                case 6:
                    a.stampaPostordine();
                    break;
                default:
                    System.out.println("Scelta non corretta!");
                    break;
            }
        } while (scelta != 0);
    }

    public void aggiunta() {
        NodoAlbero n;
        int codice;
        String descrizione;

        try {
            System.out.print("Codice: ");
            codice = Integer.valueOf(tastiera.readLine()).intValue();
            System.out.print("Descrizione: ");
            descrizione = tastiera.readLine();
            n = new NodoAlbero(codice, descrizione);
            a.inserisci(n);
        } catch(Exception e) {}
    }

    public void eliminazione() {
        int codice;

        try {
            System.out.print("Codice: ");
            codice = Integer.valueOf(tastiera.readLine()).intValue();
            a.elimina(codice);
        } catch (Exception e) {}
    }

    public void ricerca() {
        NodoAlbero n;
        int codice;

        try {
            System.out.print("Codice: ");
            codice = Integer.valueOf(tastiera.readLine()).intValue();
            n = a.contiene(codice);
        } catch (Exception e) {
            n = null;
        }

        if (n != null) {
            System.out.println("Nodo trovato:");
            n.stampa();
        } else System.out.println("Nodo inesistente!");
    }

    // avvia il programma chiamando il costruttore
    public static void main(String[] args) {
        new ProgAlbero();
    }
}
