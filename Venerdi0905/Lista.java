package Venerdi0905;

public class Lista {
    private Nodo testa = null;
    private Nodo coda = null;

    // costruttore vuoto
    public Lista() {}

    public void inserici(String str) {
        Nodo n = new Nodo(str);
        Nodo temp, succ;
        boolean aggiunto;

        if (testa == null) {
            testa = coda = n;
        } else {
            // controlla se va inserito in testa
            if (str.compareTo(testa.getDato()) < 0) {
                n.setSuccessivo(testa);
                testa = n;
            } else {
                // controlla all'interno della lista
                aggiunto = false;
                temp = testa;
                succ = testa.getSuccesivo();
                while (succ != null) {
                    if (str.compareTo(succ.getDato()) < 0) {
                        temp.setSuccessivo(n);
                        n.setSuccessivo(succ);
                        aggiunto = true;
                        break;
                    }
                    temp = succ;
                    succ = succ.getSuccesivo();
                }
                // controlla se va inserito in coda
                if (!aggiunto) {
                    coda.setSuccessivo(n);
                    coda = n;
                }
            }
        }
    }

    public void elimina(String str) {
        Nodo temp, succ;

        if (str.equals(testa.getDato())) {
            // elimina l'elemento in testa
            testa = testa.getSuccesivo();
        } else {
            temp = testa;
            succ = testa.getSuccesivo();
            while (succ != null) {
                if (str.equals(succ.getDato())) {
                    temp.setSuccessivo(succ.getSuccesivo());
                    break;
                }
                temp = succ;
                succ = succ.getSuccesivo();
            }

            // controlla se e' stata modificata la coda della lista
            if (temp.getSuccesivo() == null) {
                coda = temp;
            } 
        }
    }

    public boolean contiene(String str) {
        Nodo temp;

        temp = testa;
        while (temp != null) {
            if (str.equals(temp.getDato())) {
                return true;
            }
            temp = temp.getSuccesivo();
        }
        return false;
    }

    public void stampa() {
        Nodo temp;

        System.out.println("Contenuto lista:");
        temp = testa;
        while (temp != null) {
            System.out.println(temp.getDato());
            temp = temp.getSuccesivo();
        }
    }
}
