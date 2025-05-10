package Venerdi0905;

public class Ordine {
    private String tavolo;
    private String ordine;

    public Ordine(String tav, String ord) {
        tavolo = tav;
        ordine = ord;
    }

    public void stampa() {
        System.out.println("Tavolo: " + tavolo);
        System.out.println("Ordine: " + ordine);
    }
}
