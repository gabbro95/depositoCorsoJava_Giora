public class LeVariabili {
    public static void main(String[] args) {
        // char - contiene singolo caratteri, 'a' o 'B'
        // String - è una serie di char
        // int - contiene numeri interi
        // float - contienenumeri a virgola mobile
        // boolean - contiene valori con due stati: vero o false
        int provaNumero = 12;
        String provaTesto = "Ciao Mondo";
        boolean provaBol = true;
        System.out.println(provaNumero);
        System.out.println(provaTesto);
        System.out.println(provaBol);

        // Stampa delle variabili
        String testo = "Prova";
        String testo_ = "Testo";
        System.out.println(testo + testo_);
        int numeroIntero1 = 5;
        int numeroIntero2 = 6;
        System.out.println(numeroIntero1 + numeroIntero2);
        // Per dichiarare più variabili dello stesso tipo
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);
        // Per dichiarare più variabili dello stesso tipo e stesso valore
        int numeroX, numeroY, numeroZ;
        numeroX = numeroY = numeroZ = 50;
        System.out.println(numeroX + numeroY + numeroZ);

        /*
         * Identificatore variabile
         * possono contenere lettere, cifre, caratteri di sottolineatora
         * devono iniaziare con una lettere Maiuscola
         * non possono contenere spazi vuoti
         * possono iniziare con $ e _ ma non consigliato
         * fanno distinzione tra maiuscole e minuscole
         * le parole chiavi di java non possono essere usate come nomi delle classi
         */

        /*
         * Tipi primitivi
         * byte,short,int,long
         * Float
         * float my float = 5.75f
         * float my float = 5e75f
         * Double
         * double myDouble = 19.99d
         * booleano
         * 
        */
        boolean isJava = true;
        boolean isFerrari = false;
        System.out.println(isJava);
        System.out.println(isFerrari);
    }   
}
