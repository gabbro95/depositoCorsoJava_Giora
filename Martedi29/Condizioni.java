public class Condizioni {
    public static void main(String[] args) {
        /*
         * if (condizione) {
         *  Block
         * } else {
         *  Block
         * }
         */

        int x = 20;
        int y = 18;
        
        if (x > y) {
            System.out.println("x is greater than y");
        }

        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }  // OUTPUTS "Good evening"

        /*
         * if (condizione) {
         *  Block
         * } else if (condizione) {
         *  Block
         * } else {
         *  Block
         * }
         */

        int numero = 20;
        if (numero < 10) {
            System.out.println("Good day.");
        } else if (numero < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }  // OUTPUTS "Good evening"

        //  Scorciatoie
        /*
         * variabile = (condition) ? "Good day." : "Goo evening."
         */

        int timee = 20;
        String result = (timee < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
