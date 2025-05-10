public class OperatoriLogiciEs7 {
    public static void main(String[] args) {
        /*  Esercizio 7
         * Scrivi un programma Java che determini se un numero è pari e divisibile per 3.
        */
        
        int numero = 12;
        boolean pariDivisibileTre = numero % 2 == 0 && numero % 3 == 0;
        System.out.println("Il numero è pari e divisibile per 3? " + pariDivisibileTre);
    }
}
