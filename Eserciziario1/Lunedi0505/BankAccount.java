/*
 * scrivere un programma che costruisca un conto bancario chiamato 
    harrysChecking, versi in esso $1000, prelevi da esso $500, prelevi altri $400 e 
    infine visualizzi il saldo rimanente.
    Il programma deve poi creare un altro conto bancario chiamato momsSaving, 
    utilizzando il costruttore che inizializza la variabile balance. 
    Su quest’ultimo conto deve essere poi applicato un interesse del 10%, a seguito 
    del quale viene stampato il saldo.
 */
 
public class BankAccount {
    private double balance;

    // Costruttore della classe BankAccount con conto bancario con saldo uguale a zero 
    public BankAccount() { 
        balance = 0; 
    } 

    /* Costruttore della classe BankAccount con conto bancario con un saldo assegnato. 
        @param initialBalance Il saldo iniziale
    */ 
    public BankAccount(double initialBalance) { 
        balance = initialBalance; 
    }

    /* Metodo che versa denaro nel conto bancario 
        @param amount L'importo da versare
    */ 
    public void deposit(double amount) { 
        balance = balance + amount; 
    }

    /* Metodo che preleva denaro dal conto bancario 
        @param amount L'importo da prelevare
    */ 
    public void withdraw(double amount) { 
        balance = balance - amount; 
    } 

    /* Metodo che restituisce il valore del saldo attuale del conto bancario 
        @return Il saldo attuale
    */ 
    public double getBalance() { 
        return balance; 
    } 

    /* Metodo che calcola un interesse sul conto.
        @param rate Il tasso d'interesse 
    */ 
    public void addInterest(double rate) { 
        balance = balance + ((balance * rate) / 100); 
    }
}
