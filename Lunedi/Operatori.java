public class Operatori {
    public static void main(String[] args) {
        int x = 10;
        x += 5; // Assegnazione
        System.out.println(x);
        x++;  // Incremento
        System.out.println(x);
        System.out.println(x%2);  // Aritmetico
        x--;  // Decremento
        System.out.println(x);
        System.out.println(x%2);

        // Operatori di confronto
        int numero1 = 5;
        int numero2 = 3;
        System.out.println(numero1 > numero2);  // returns true
        /*
         * <    minore
         * <=   minore o uguale
         * >    maggiore
         * >=   maggiore  o uguale
         * ==   uguale
         * !=   diverso
         */
        System.out.println(numero1 == numero2);
        System.out.println(numero1 != numero2);
        /*
         * &&   AND
         * ||   OR
         * !    NOT
         */
        boolean yes = true;
        boolean no = false;
        System.out.println(yes && no);  // returns false
        System.out.println(yes || no);  // returns true
        System.out.println(yes && !no);   // returns true
    }
}
