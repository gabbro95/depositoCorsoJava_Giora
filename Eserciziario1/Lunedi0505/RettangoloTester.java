public class RettangoloTester {
    public static void main(String[] args) { 
        // Crea un oggetto di tipo Rettangolo con parametri predefiniti 
        Rettangolo r = new Rettangolo(); 

        // Stampa il perimetro dell'oggetto Rettangolo
        System.out.println("Perimetro: " + r.getPerimetro());

        // Stampa l'area dell'oggetto Rettangolo
        System.out.println("Area: " + r.getArea()); 

        // Crea un altro oggetto di tipo Rettangolo con parametri dati 
        Rettangolo rr = new Rettangolo(5, 3); 

        // Stampa il perimetro dell'oggetto Rettangolo 
        System.out.println("Perimetro: " + rr.getPerimetro()); 
        
        // Stampa l'area dell'oggetto Rettangolo 
        System.out.println("Area: " + rr.getArea()); 
    }
}
