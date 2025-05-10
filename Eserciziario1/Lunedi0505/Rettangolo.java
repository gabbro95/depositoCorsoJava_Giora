/*
 * Si costruisce un rettangolo partendo da una base, un’altezza
 */
public class Rettangolo {
    private int base; 
    private int altezza; 
    
    // Costruttore che crea un rettangolo con dei parametri predefiniti
    
    public Rettangolo() { 
        base = 1; 
        altezza = 1;
    }
    
    /* Costruttore che crea un rettangolo con dei parametri dati. 
        @param unaBase È la base del rettangolo
        @param unAltezza È l'altezza del rettangolo
    */ 
    public Rettangolo(int unaBase, int unAltezza) { 
        base = unaBase; 
        altezza = unAltezza; 
    } 

    // Metodo che restituisce la base del rettangolo
    public int getBase() { 
        return base; 
    } 

    // Metodo che restituisce l'altezza del rettangolo
    public int getAltezza() { 
        return altezza; 
    } 

    // Metodo che modifica la base del rettangolo 
    public void setBase(int nuovaBase) { 
        base = nuovaBase; 
    } 

    // Metodo che modifica l’altezza del rettangolo 
    public void setAltezza(int nuovaAltezza) { 
        altezza = nuovaAltezza; 
    } 

    // Metodo che calcola il perimetro del rettangolo
    public int getPerimetro() { 
        return (base + altezza)*2; 
    } 

    // Metodo che calcola l’area del rettangolo
    public int getArea() { 
        return base * altezza; 
    }


}
