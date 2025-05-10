package Venerdi0905;

public class ProgPila {
    public static void main(String[] args) {
        // crea una pila vuota
        Pila pila = new Pila();

        int num;
        Integer numObj;

        // Aggiunge elementi alla pila
        for (int i=0; i<10; i++) {
            num = (int) (Math.random()*100);
            numObj = new Integer(num);
            System.out.print(numObj + " ");
            pila.push(numObj);
        }
        System.out.println("\nElementi nella pila: " + pila.size());

        // toglie gli elementi e li visualizza 
        while (!pila.vuota()) {
            numObj = (Integer) pila.pop();
            System.out.print(numObj + " ");
        }
        System.out.println();
    }
}
