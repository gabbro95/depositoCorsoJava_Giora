import java.util.Scanner;

public class BankAccountTester {
    public static void main(String[] args) {   
        // Crea l'oggetto password
        BankWithPassword password = new BankWithPassword();
        
        // Crea l' oggetto per la digitazione da tastiera
        Scanner scanner = new Scanner(System.in);

        boolean statePassword = false;  // Stato della verifica password
        
        // Non esegue la procedura finchè la password inserita non è corretta
        while (!statePassword) {
            
            //Richiede la password
            System.out.print("Inserire la password: ");
            int pass = scanner.nextInt();

            if (password.controlPassword(pass)) statePassword = true;
            
        }
        scanner.close();  

        System.out.println("Password corrretta");

        /* 
         * Crea un oggetto della classe BankAccount 
         * chiamato harrysChecking
         */ 
        BankAccount harrysChecking = new BankAccount(); 

        // Deposita sul conto di harrysChecking 1000 dollari 
        harrysChecking.deposit(1000); 

        // Prela dal conto di harrysChecking 500 dollari 
        harrysChecking.withdraw(500); 

        // Prela dal conto di harrysChecking 400 dollari 
        harrysChecking.withdraw(400); 

        // Stampo il conto di harrysChecking 
        System.out.println("Dollars harrysChecking : " +harrysChecking.getBalance()); 

        /* Creo un oggetto della classe BankAccount,
         * con già 1000 dollari in partenza,
         * e lo chiamo momsSaving
         */ 
        BankAccount momsSaving = new BankAccount(1000); 

        // Calcola l'interesse del 10% sul conto momsSavings
        momsSaving.addInterest(10); 

        // Stampa il conto di momsSavings 
        System.out.println("Dollars momsSaving: " + momsSaving.getBalance());  
    }
}
