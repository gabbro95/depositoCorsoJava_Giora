public class DipendenteTester {
    public static void main(String[] args) { 
        // Creo un oggetto di classe Dipendente chiamato d 
        Dipendente d = new Dipendente(); 

        // Imposta un nome a d
        d.setNome("Andrea"); 

        // Inserisce il valore dello stipendio 
        d.setStipendio(1000.0);

        // Incrementa del 10% lo stipendio 
        d.aumento(10.0); 

        // Stampa il nome e lo stipendio del dipendente
        System.out.println(d.getNome() + " = " + d.getStipendio()); 
        
        // Crea un altro oggetto di classe Dipendente chiamato m
        Dipendente m = new Dipendente("Mario", 1500);

        // Incrementa del 10% lo stipendio 
        m.aumento(10.0); 

        // Stampa il nome e lo stipendio del dipendente
        System.out.println(m.getNome() + " = " + m.getStipendio()); 
    }
}
