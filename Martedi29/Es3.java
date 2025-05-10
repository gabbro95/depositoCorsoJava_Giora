import java.util.Scanner; // Import the Scanner class

public class Es3 {
    public static void main(String[] args) {
        // Inizializzo le variabili
        boolean login = false;
        boolean signin = false;
        boolean run = true;
        boolean controllo = false;
        String userName = "";
        String userPass = "";

        // Controlla se le variabili user hanno un valore al suo interno 
        if (userName.isEmpty() && userPass.isEmpty()) signin = true;
            else login = true;
        // Avvio applicazione
        while(run) {
            if (login) {    // Esegue il LOGIN
                Scanner scanner = new Scanner(System.in);
                System.out.println("Login!");
                System.out.print("Inserire userName: ");
                String user = scanner.nextLine();
                System.out.print("Inserire passworld: ");
                String passworld = scanner.nextLine();
                if (userName.equals(user) && userPass.equals(passworld)) {
                    System.out.println("Accesso eseguito!");
                    controllo = true;
                    login = false;
                }
                else System.out.println("Controlla userName e passworld e riprova");
                System.out.println("");
            } else if (signin) {    // Esegue il SIGNIN
                Scanner scanner = new Scanner(System.in);
                System.out.println("Signin!");
                System.out.print("Inserire userName: ");
                userName = scanner.nextLine();
                System.out.print("Inserire passworld: ");
                userPass = scanner.nextLine();
                System.out.println("Utente " + userName + " creato!");
                System.out.println("");
                signin = false;
                login = true;
            } else if (controllo) {    // User LOGIN scelta su cosa fare
                Scanner scannerControllo = new Scanner(System.in);
                System.out.println("Digita il numero della scelta da eseguire:\n1. Calcolatrice\n2. Modifica dati user\n3. Esci");
                int scelta = scannerControllo.nextInt();
                switch (scelta) {    // Esegue la calcolatrice
                    case 1:
                        Scanner scannerCase1 = new Scanner(System.in);
                        System.out.print("Digita l\' operazione da svolgere: ");
                        String op = scannerCase1.nextLine();
                        System.out.print("Digita il valore del primo numero: ");
                        int numero1 = scannerCase1.nextInt();
                        System.out.print("Digita il valore del secondo numero: ");
                        int numero2 = scannerCase1.nextInt();
                        int risultato = 0;
                        switch (op) {    // Esegue L'operazione
                            case "somma":
                                risultato = numero1 + numero2;
                                break;
                            case "differenza":
                                risultato = numero1 - numero2;    
                                break;
                            case "prodotto":
                                risultato = numero1 * numero2;
                                break;
                        }
                        System.out.println("");
                        System.out.println("Risultato " + op + ": " + risultato);
                        System.out.println("");
                        break;
                    case 2:    // Esegue la modifica dei dati user
                        Scanner scannerCase2 = new Scanner(System.in);
                        System.out.println("Digita il valore del dato da modificare:\n1. userName\n2. passworld");
                        int modifica = scannerCase2.nextInt();
                        switch (modifica) {
                            case 1:    // Esegue la modifica del userName
                                Scanner scannerCase21 = new Scanner(System.in);
                                System.out.print("Digita il nuovo userName: ");
                                userName = scannerCase21.nextLine();
                                break;
                            case 2:    // Esegue la modifica della password
                                Scanner scannerCase22 = new Scanner(System.in);
                                System.out.print("Digita la nuova password: ");
                                userPass = scannerCase22.nextLine();
                                break;
                        }
                        System.out.println("Modifica dati user terminata!");
                        System.out.println("");
                        break;
                    case 3:    // Esce dall' applicazione
                        run = false;
                        break;
                }
            }
        }
    }
}
