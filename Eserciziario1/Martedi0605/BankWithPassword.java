/*
 * Lo scopo del programma è riadattare il programma dell’esercizio 3.1, 
    introducendo il metodo public boolean controlPassword(int pass), che restituisce 
    true se la password inserita è corretta, false altrimenti. Questo metodo deve 
    essere utilizzato all’interno di altri metodi per verificare che la password sia 
    corretta e dare il consenso per procedere alle operazioni di deposit, whithdraw 
    e addInterest (presenti nell’esercizio BanckAccount 3.1) 
 */

public class BankWithPassword extends BankAccount {
   // Variabili di classe
   protected int password;

   // Costruttore inizializza l' oggetto BankWithPassword
   public BankWithPassword() {
      password = 1234;
   }

   /* Metodo che riceve una passaword e restituisce se è corretta
      @pass  password passata
      @state ritorna lo stato
   */ 
   public boolean controlPassword(int pass) {
      boolean state = false;

      // Controllo password
      if (pass == password)   state = true;

      return state;
   }

}