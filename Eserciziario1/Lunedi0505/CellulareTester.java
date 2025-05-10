public class CellulareTester {
    public static void main(String[] args) { 
        /* Crea un oggetto della classe Cellulare, 
         * con 20€ di credito e 0 chiamate effettuate
         */ 
        Cellulare nokia = new Cellulare(20.0,0); 

        // Ricarica il cellure di 50€ 
        nokia.ricarica(50.0); 

        // Effettua una chiamata di 13 minuti 
        nokia.chiamata(13.0); 

        // Stampa il credito 
        System.out.println("Credito: " + nokia.numero404()); 

        // Stampa il numero di chiamate effettuate 
        System.out.println("Numero Chiamate: " + nokia.getNumeroChiamate()); 

        // Azzera il numero di chiamate effettuate 
        nokia.azzeraChiamate(); 

        // Stampa il numero di chiamate effettuate
        System.out.println("Numero Chiamate: " + nokia.getNumeroChiamate()); 
    }
}
