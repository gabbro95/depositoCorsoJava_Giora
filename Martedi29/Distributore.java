import java.util.Scanner; // Import the Scanner class

public class Distributore {
    public static void main(String[] args) {
        double credito = (double)(Math.random() * 10); // 0 to 10
        
        boolean controllo = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Caffe - 1.50€\n2. Cappuccino - 2.00€\n3. Tè - 1.00€\n4. Acqua - 0.50€\n5. Uscire\nCredito residuo: " + credito + "€");

        while(controllo) {
            // Richiede un numero 
            System.out.print("Inserisci un numero per acquistare la bevanda: ");
            int numero = scanner.nextInt();
            System.out.println(numero);

            switch (numero) {
                case 1:
                    if (credito >= 1.50){
                        System.out.println("Hai aquistato Caffè");
                        credito -= 1.50;
                    } else System.out.println("Non hai credito sufficente!");
                    break;
                case 2:
                    if (credito >= 2.00) {
                        System.out.println("Hai aquistato Cappucino");
                        credito -= 2.00;
                    } else System.out.println("Non hai credito sufficente!");
                    break;
                case 3:
                    if (credito >= 1.00) {
                        System.out.println("Hai aquistato il Tè");
                        credito -= 1.00;
                    } else System.out.println("Non hai credito sufficente!");
                    break;
                case 4:
                    if (credito >= 0.50) {
                        System.out.println("Hai aquistato l\'Acqua");
                        credito -= 0.50;
                    } else System.out.println("Non hai credito sufficente!");
                    break;
                case 5:
                    System.out.println("Grazie per averci scelto.\nIl tuo credito rimanente è: " + credito);
                    controllo = false;
                    break;
                default:
                    System.out.println("Devi selezionare solo numeri da 1 a 5.");
                    break;
            }
            System.out.println("Credito rimanente: " + credito + "€");
        }

        scanner.close();
    }
}
