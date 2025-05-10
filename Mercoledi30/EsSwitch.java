/*
 * Esercizi svolti dal link: https://www.codegrind.it/esercizi/java/switch
 */
import java.util.Scanner;   // Importa Scanner per l'inserimento da tastiera

public class EsSwitch {
    public static void main(String[] args) {
        boolean run = true;     // Stato per mantenere attiva l'esecuzione

        while(run) {
            //  Inizializzazione oggetto
            EserciziSwitch eserciziSwitch = new EserciziSwitch();   // Crea l' oggetto EsSwitch
            Scanner scannerMenu = new Scanner(System.in);           // Crea uno scanner per la scelta
            //  Stampa il menu a schermo
            System.out.println("");
            System.out.print(
                "Scegli cosa fare, digita il numero relativo alla scelta!\n"+ 
                "1. Nome del giorno\n"+
                "2. Nome del mese\n"+
                "3. Numero dei giorni nel mese\n"+
                "4. Stagione\n"+
                "5. Nome del mese abbreviato\n"+
                "6. Esci\n\n"+
                "Scelta: "
                );
            //  Entra nel menu
            int scelta = scannerMenu.nextInt();
            switch (scelta) {
                case 1:     //  Trova il nome del giorno
                    Scanner scannerMenu1 = new Scanner(System.in);
                    System.out.print("Inserisci un numero del giorno della settimana: ");
                    eserciziSwitch.numeroGiorno = scannerMenu1.nextInt();

                    eserciziSwitch.nome_giorno();       //  Aggiorna le variabili
                            // Stampa il risultato
                    System.out.println("");
                    System.out.println("Il numero inserito " + eserciziSwitch.numeroGiorno + " corrisponde al giorno della settimana: " + eserciziSwitch.nomeGiorno + "!");
                    break;
                case 2:     //  Trova il nome del mese
                    Scanner scannerMenu2 = new Scanner(System.in);
                    System.out.print("Inserisci il numero corrispondente al mese: ");
                    eserciziSwitch.numeroMese = scannerMenu2.nextInt();

                    eserciziSwitch.nome_mese();       //  Aggiorna le variabili
                            // Stampa il risultato
                    System.out.println("");
                    System.out.println("Il numero inserito " + eserciziSwitch.numeroMese + " corrisponde al mese di: " + eserciziSwitch.nomeMese + "!");
                    break;
                case 3:     //  Numero dei giorni nel mese
                    Scanner scannerMenu3 = new Scanner(System.in);
                    System.out.print("Inserisci l\' anno corrente': ");
                    eserciziSwitch.anno = scannerMenu3.nextInt();
                    System.out.print("Inserisci un numero del mese: ");
                    eserciziSwitch.numeroMese = scannerMenu3.nextInt();

                    eserciziSwitch.numero_giorni();       //  Aggiorna le variabili
                            // Stampa il risultato
                    System.out.println("");
                    if (eserciziSwitch.numeroGiorni < 0) System.out.println("Inserisci un numero da 1 a 12 corrispondente il mese!");
                    else System.out.println("Il mese " + eserciziSwitch.numeroMese + " ha: " + eserciziSwitch.numeroGiorni + " giorni!");
                    break;
                case 4:     //  Trova la stagione
                    Scanner scannerMenu4 = new Scanner(System.in);
                    System.out.print("Inserisci un numero del mese relativo alla stagione: ");
                    eserciziSwitch.numeroMese = scannerMenu4.nextInt();

                    eserciziSwitch.stagione();           //  Aggiorna le variabili
                            // Stampa il risultato
                    System.out.println("");
                    System.out.println("Il mese " + eserciziSwitch.numeroMese + " corrisponde alla stagione: " + eserciziSwitch.stagione + "!");
                    break;
                case 5:     //  Trova il nome del mese
                    Scanner scannerMenu5 = new Scanner(System.in);
                    System.out.print("Inserisci il numero corrispondente al mese: ");
                    eserciziSwitch.numeroMese = scannerMenu5.nextInt();

                    eserciziSwitch.nome_mese();       //  Aggiorna le variabili
                            // Stampa il risultato
                    System.out.println("");
                    System.out.println("Il numero inserito " + eserciziSwitch.numeroMese + " corrisponde al mese di: " + eserciziSwitch.nomeMese.substring(0, 3) + "!");
                    break;
                case 6:     //  Chiude l'esecuzione del programma
                    System.out.println("Chisura applicazione!");
                    run = false;
                    break;
                default:
                    System.out.println("Puoi inserire solo valori numerici da 1 a 4!");
            }
        }
    }
}
