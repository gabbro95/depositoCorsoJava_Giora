import java.util.Scanner; // Import the Scanner class

class Esercizio1 {
    public static void main(String[] args) {
        Scanner myObjInt = new Scanner(System.in); // Create a scanner object
        Scanner myObjStri = new Scanner(System.in); // Create a scanner object
        

        System.out.println("Inserire un intero");
        int varInt = myObjInt.nextInt(); // Read input

        System.out.println("Inserire un numero con la virgola");
        float varFloat = myObjInt.nextFloat(); // Read float
        
        System.out.println("Inserire un numero con  piu numeri dopo la virgola");
        double varDouble = myObjInt.nextDouble(); // Read double
        
        System.out.println("Inserire un testo");
        String varString = myObjStri.nextLine(); // Read String
        
        System.out.println("Inserire un un valore boleano");
        boolean varBoolean = myObjInt.nextBoolean(); // Read boolean
        
        // Stampa a schermo i risultati

        System.out.println("Tipo intero: " + varInt);
        System.out.println("Tipo float: " + varFloat);
        System.out.println("Tipo double: " + varDouble);
        System.out.println("Tipo string: " + varString);
        System.out.println("Tipo boolean: " + varBoolean);
    }
}
