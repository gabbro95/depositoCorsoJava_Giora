package Venerdi0905;

public class ProgBar {
    public static void main(String[] args) {
        Coda codaOrdinazioni = new Coda();
        Ordine ord;

        ord = new Ordine("05", "4 caffe'");
        codaOrdinazioni.aggiungi(ord);
        System.out.println("Ordine aggiunto!");

        ord = new Ordine("03", "2 bibite'");
        codaOrdinazioni.aggiungi(ord);
        System.out.println("Ordine aggiunto!");

        ord = new Ordine("11", "1 caffe e 2 bibite'");
        codaOrdinazioni.aggiungi(ord);
        System.out.println("Ordine aggiunto!");

        ord = (Ordine) codaOrdinazioni.togli();
        System.out.println("Soddisfatto ordine:");
        ord.stampa();

        ord = new Ordine("15", "1 cappucino'");
        codaOrdinazioni.aggiungi(ord);
        System.out.println("Ordine aggiunto!");

        ord = (Ordine) codaOrdinazioni.togli();
        System.out.println("Soddisfatto ordine:");
        ord.stampa();

        ord = (Ordine) codaOrdinazioni.togli();
        System.out.println("Soddisfatto ordine:");
        ord.stampa();

        ord = (Ordine) codaOrdinazioni.togli();
        System.out.println("Soddisfatto ordine:");
        ord.stampa();
    }
}
