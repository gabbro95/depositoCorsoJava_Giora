package Venerdi0905;

public class Albero {
    public NodoAlbero radice;

    public Albero() {
        radice = null;
    }

    public void inserisci(NodoAlbero nuovo) {
        if (radice == null) radice = nuovo;
        else inserisci(nuovo, radice);
    }

    private void inserisci(NodoAlbero nuovo, NodoAlbero n) {
        if (nuovo.codice == n.codice) n.eliminato = false;
        else if (nuovo.codice < n.codice) {
            if (n.sinistro == null) n.sinistro = nuovo;
            else inserisci(nuovo, n.sinistro);
        } else {
            if (n.destro == null) n.destro = nuovo;
            else inserisci(nuovo, n.destro);;
        }
    }

    public void elimina(int elim) {
        elimina(elim, radice);
    }

    private void elimina(int elim, NodoAlbero n) {
        if (n != null) {
            if (elim == n.codice) {
                n.eliminato = true;
                System.out.println("Nodo eliminato!");
            } else if (elim < n.codice) {
                elimina(elim, n.sinistro);
            } else elimina(elim, n.destro);
        } else System.out.println("Nodo non trovato!");
    }

    public NodoAlbero contiene(int cerca) {
        return contiene(cerca, radice);
    }

    private NodoAlbero contiene(int cerca, NodoAlbero n) {
        if (n != null) {
            if (cerca == n.codice) {
                if (n.eliminato) return null;
                else return n;
            } else if (cerca > n.codice) {
                return contiene(cerca, n.sinistro);
            } else return contiene(cerca, n.destro);
        } else {
            return null;
        }
    }

    public void stampaInordine() {
        stampaInordine(radice);
    }

    private void stampaInordine(NodoAlbero n) {
        if (n != null) {
            stampaInordine(n.sinistro);
            n.stampa();
            stampaInordine(n.destro);
        }
    }

    public void stampaPreordine() {
        stampaPreordine(radice);
    }

    private void stampaPreordine(NodoAlbero n) {
        if (n != null) {
            n.stampa();
            stampaPreordine(n.sinistro);
            stampaPreordine(n.destro);
        }
    }

    public void stampaPostordine() {
        stampaPostordine(radice);
    }

    private void stampaPostordine(NodoAlbero n) {
        if (n != null) {
            n.stampa();
            stampaPostordine(n.destro);
            stampaPostordine(n.sinistro);
        }
    }
}
