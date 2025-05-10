public class Mstematica {
    public static void main(String[] args) {
        System.out.println(Math.max(5, 10));    // valore piu alto
        System.out.println(Math.min(5, 10));    // valore piu basso
        System.out.println(Math.sqrt(64));      // radice quadrata
        System.out.println(Math.abs(-4.7));     // valore assoluto positivo
        System.out.println(Math.random());    // numero casuale
        // Per ottenere un maggiore controllo sul numero casuale, per avere un range in cui i numeri devono uscire
        int randomNum = (int)(Math.random() * 101); // 0 to 100
        System.out.println(randomNum);
    }
}
