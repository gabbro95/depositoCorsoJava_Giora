package Venerdi0905;

public class Nodo {
    private String dato;
    private Nodo succesivo;

    public Nodo(String dato) {
        this.dato = dato;
        succesivo = null;
    }

    public void setSuccessivo(Nodo succ) {
        succesivo = succ;
    }

    public Nodo getSuccesivo() {
        return succesivo;
    }

    public String getDato() {
        return dato;
    }
}