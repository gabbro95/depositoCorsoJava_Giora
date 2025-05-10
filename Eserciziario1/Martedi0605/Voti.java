/*
 * Scrivete un programma per convertire la lettera di un voto scolastico nel numero 
    corrispondente. Le lettere sono A, B, C, D e F, eventualmente seguite dai segni 
    + o -. I loro valori numerici sono 4, 3, 2, 1 e 0. F+ e F- non esistono. Un 
    segno + o – incrementa o decrementa il valore numerico di 0.3. Tuttavia, A+ è 
    uguale a 4.0. Usate una classe Grade con un metodo getNumericGrade. 
    Consigli: 
    Si consiglia di intendere il voto come un double, anziché una stringa. Ciò 
    semplifica l’esecuzione del programma: in tal modo, il voto può essere 
    modificato tramite semplici operazioni aritmetiche. 
 */

public class Voti {
    // Variabili locali
    String votoL, segno;
    double votoN;

    // Costruttore
    public Voti() {
        votoL = "";
        votoN = 0;
        segno = "";
    }

    /* Metodo che restituisce un numero a partire dal voto in lettere
        @param input  voto in lettere
        @return  voto espresso in double
     */
    public double getNumericGrade(String input) {
        votoL = input.substring(0,1); 
        segno = input.substring(1);

        //  Valore per il quale si associa + o -
        final double SEGNO = 0.3; 

        //  Esegue l'assegnazione nel caso voloL sia diverso da F
        switch (votoL) {
            case "A":
                votoN = 4.0;
                break;
            case "B":
                votoN = 3.0;
                break;
            case "C":
                votoN = 2.0;
                break;
            case "D":
                votoN = 1.0;
                break;
        }

        if (segno.contentEquals("+") && !votoL.equalsIgnoreCase("A"))   votoN += SEGNO;
        else if (segno.contentEquals("-"))  votoN -= SEGNO;

        return votoN;
    }


}
