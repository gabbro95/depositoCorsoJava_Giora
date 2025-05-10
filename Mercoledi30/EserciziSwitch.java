
public class EserciziSwitch {
    int numeroGiorno = 0;
    int numeroMese = 0;
    int numeroGiorni = 0;
    int anno = 0;
    String nomeGiorno;
    String nomeMese;
    String stagione;

    void nome_giorno () {
        switch (numeroGiorno) {
            case 1:
                nomeGiorno = "Lunedì";
                break;
            case 2:
                nomeGiorno = "Martedì";
                break;
            case 3:
                nomeGiorno = "Mercoledì";
                break;
            case 4:
                nomeGiorno = "Giovedì";
                break;
            case 5:
                nomeGiorno = "Venerdì";
                break;
            case 6:
                nomeGiorno = "Sabato";
                break;
            case 7:
                nomeGiorno = "Domenica";
                break;
            default:
                nomeGiorno = "Numero non valido";
        }
    }

    void nome_mese() {
        switch (numeroMese) {
            case 1:
                nomeMese = "Gennaio";
                break;
            case 2:
                nomeMese = "Febbraio";
                break;
            case 3:
                nomeMese = "Marzo";
                break;
            case 4:
                nomeMese = "Aprile";
                break;
            case 5:
                nomeMese = "Maggio";
                break;
            case 6:
                nomeMese = "Giugno";
                break;
            case 7:
                nomeMese = "Luglio";
                break;
            case 8:
                nomeMese = "Agosto";
                break;
            case 9:
                nomeMese = "Settembre";
                break;
            case 10:
                nomeMese = "Ottobre";
                break;
            case 11:
                nomeMese = "Novermbre";
                break;
            case 12:
                nomeMese = "Dicembre";
                break;
            default:
                nomeMese = "Numero non valido";
        }
    }

    void stagione() {
        switch (numeroMese) {
            case 12:
            case 1:
            case 2:
                stagione = "Inverno";
                break;
            case 3:
            case 4:
            case 5:
                stagione = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                stagione = "Estate";
                break;
            case 9:
            case 10:
            case 11:
                stagione = "Autunno";
                break;
            default:
                stagione = "Numero fuori range";
        }
    }

    void numero_giorni() {
        switch (numeroMese) {
            case 1:
                numeroGiorni = 31;
                break;
            case 2:
                boolean bisestile = (anno % 4 == 0 && anno % 100 != 0) || anno % 400 == 0;
                if (bisestile) numeroGiorni = 29;
                else numeroGiorni = 28;
                break;
            case 3:
                numeroGiorni = 31;
                break;
            case 4:
                numeroGiorni = 30;
                break;
            case 5:
                numeroGiorni = 31;
                break;
            case 6:
                numeroGiorni = 30;
                break;
            case 7:
                numeroGiorni = 31;
                break;
            case 8:
                numeroGiorni = 31;
                break;
            case 9:
                numeroGiorni = 30;
                break;
            case 10:
                numeroGiorni = 31;
                break;
            case 11:
                numeroGiorni = 30;
                break;
            case 12:
                numeroGiorni = 31;
                break;
            default:
                numeroGiorni = -1;
        }
    }
}
