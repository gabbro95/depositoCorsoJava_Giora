import java.util.Scanner; // Import the Scanner class

public class Es1 {
    public static void main(String[] args) {
        String nome = "admin";  // nome da inserire
        String passworldNome = "12345";    // passworld da inserire

        Scanner scanner = new Scanner(System.in); // Create a scanner object
        
        System.out.println("Enter name");  // inserire valore
        String user = scanner.nextLine(); // Read user input

        System.out.println("Enter passworld");  // inserire valore
        String passworld = scanner.nextLine(); // Read passworld input
        
        if ((nome.equals(user)) && (passworldNome.equals(passworld))) {  
            System.out.println("Inserimento corretto");
        } else {
            System.out.println("Conttrolla username o passworld");
        }
    }
}
