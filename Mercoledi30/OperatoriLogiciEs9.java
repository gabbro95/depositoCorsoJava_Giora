public class OperatoriLogiciEs9 {
    public static void main(String[] args) {
        /*  Esercizio 9
         * Scrivi un programma Java che determini se una stringa inizia con la lettera "A"
         * o con la lettera "B".
        */

        String testo = "Banana";
        boolean iniziaAB = testo.startsWith("A") || testo.startsWith("B");
        System.out.println("La stringa inizia con A o B? " + iniziaAB);
    }
}
