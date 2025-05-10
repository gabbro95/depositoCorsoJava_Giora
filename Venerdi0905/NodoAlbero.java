package Venerdi0905;

public class NodoAlbero {
    // informazioni del nodo
    public int codice;
    public String descrizione;
    public boolean eliminato;

    // sotto alberi
    public NodoAlbero sinistro;
    public NodoAlbero destro;

    public NodoAlbero(int codice, String descrizione) {
        this.codice = codice;
        this.descrizione = descrizione;

        eliminato = false;
        sinistro = null;
        destro = null;
    }

    public void stampa() {
        System.out.print("-" + codice + "-" + descrizione);
        if (eliminato){
            System.out.print("(eliminato)");
        }
        System.out.println();
    }
}
