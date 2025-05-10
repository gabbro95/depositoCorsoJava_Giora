/*
 * Progettare una classe di nome Dipendente. Tale classe prevede due variabili di 
    istanza una definita come nome, di tipo String e una definita come stipendio di 
    tipo double. Scrivere un costruttore senza parametri, un costruttore con due 
    parametri (nome e stipendio).La classe deve inoltre implementare i seguenti 
    metodi. Un metodo definito come public String getNome() che restituisce il nome 
    del dipendente. Un metodo definito come public double getStipendio() che 
    restituisce lo stipendio del dipendente. Un metodo public void 
    setStipendio(double nuovoStipendio) che modifica il valore dello stipendio. Un 
    metodo public void setNome(String nuovoNome) che cambia il nome al dipendente. 
    Aggiungere poi un metodo aumento(double percentuale), che incrementi lo 
    stipendio del dipendente secondo una certa percentuale. 
 */
public class Dipendente {
    private String nome; 
    private double stipendio; 

    // Costruttore senza parametri che costruisce un oggetto della classe Dipendente
    public Dipendente() { 
        nome = ""; 
        stipendio = 0; 
    }

    /* Costruttore che inizializza le variabili con valori predefiniti
        @param unNome Il nome del del dipendente 
        @param unoStipendio Lo stipendio del dipendente
    */ 
    public Dipendente(String unNome, double unoStipendio) { 
        nome = unNome; 
        stipendio = unoStipendio; 
    } 
    
    /* Metodo che restituisce il nome del dipendente 
        @return Il nome del del dipendente
    */ 
    public String getNome() { 
        return nome; 
    } 

    /* Metodo che restituisce lo stipendio del dipendente
        @return Lo stipendio
    */ 
    public double getStipendio() { 
        return stipendio; 
    } 

    /* Metodo che modifica il valore dello stipendio 
        @param nuovoStipendio Il nuovo valore dello stipendio
    */ 
    public void setStipendio(double nuovoStipendio) { 
        stipendio = nuovoStipendio; 
    } 

    /* Metodo che modifica la stringa del nome
        @param nuovoNome Il nuovo nome dell’operaio
    */ 
    public void setNome(String nuovoNome) { 
        nome = nuovoNome; 
    } 

    /* Metodo che incrementa lo stipendio del dipendente
        @param percentuale Il tasso di aumento dello stipendio
    */ 
    public void aumento(double percentuale) { 
        stipendio = stipendio + ((stipendio * percentuale) / 100); 
    }
}
