public class EserciziSwitchEs6 {
    public static void main(String[] args) {
        /*
         *Scrivi un programma Java che calcola il costo di spedizione in base al peso di un pacco
         utilizzando il blocco "switch".
         */
        double pesoPacco = 2.5;
        double costoSpedizione;

        switch ((int) pesoPacco) {
            case 1:
                costoSpedizione = 2.0;
                break;
            case 2:
                costoSpedizione = 4.0;
                break;
            case 3:
            case 4:
            case 5:
                costoSpedizione = 10.0;
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                costoSpedizione = 15.0;
                break;
            default :
                costoSpedizione = -1.0;
        }
        if (costoSpedizione < 0) System.out.println("Il pacco è troppo pesante per la spezione!");
        else System.out.println("Il costo di spedizione per un pacco di peso " + pesoPacco + " kg è di " + costoSpedizione + " euro.");

    }
}
