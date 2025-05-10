import java.util.Arrays;

public class CaratteriSpeciali {
    public static void main(String[] args) {
        String testo = "c\'è";
        String testo1 = "Premi \"qui";
        System.out.println(testo);
        System.out.println(testo1);

        String testo2 = "tab\t ciao";
        System.out.println(testo2);
        String testo3 = "ciao cono io\n\fcomunamente";
        System.out.println(testo3);

        String str = "Hello World";
        String[] words = str.split("\\s");
        System.out.println(Arrays.toString(words));

        String descrizione = "Articolo sulle stringhe....";
        int lenght = descrizione.length();
        System.out.println("Lunghezza: "+lenght);

        String testoTrim = "C i a o !";
        System.out.println(testoTrim.trim());
    }
}
