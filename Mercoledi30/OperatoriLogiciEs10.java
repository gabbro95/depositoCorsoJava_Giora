public class OperatoriLogiciEs10 {
    public static void main(String[] args) {
        /*  Esercizio 10
         * Scrivi un programma Java che verifichi se un carattere è una consonante minuscola.
        */

        char word = 'g';
        boolean consonanteMinuscola = word >= 'a' && word <= 'z' && word != 'a' && word != 'e' && word != 'i' && word != 'o' && word != 'u';
        System.out.println("Il carattere è una consonante minuscola? " + consonanteMinuscola);
    }
}
