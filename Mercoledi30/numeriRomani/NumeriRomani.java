package numeriRomani;

public class NumeriRomani {
    String numeroRomano = "";
    int numeroDecimale;
    int converteDecimale;

    void ricerca_numero_romano() {
        switch (numeroRomano) {
            case "I":
                numeroDecimale = 1;
                break;
            case "V":
                numeroDecimale = 5;
                break;
            case "X":
                numeroDecimale = 10;
                break;
            case "L":
                numeroDecimale = 50;
                break;
            case "C":
                numeroDecimale = 100;
                break;
            case "D":
                numeroDecimale = 500;
                break;
            case "M":
                numeroDecimale = 1000;
                break;
            default:
                numeroDecimale = -1;
        }
    }

    void converti_decimale_romano() {
        int decimale = -1;
        if (converteDecimale == 50) {
            numeroRomano = "L";
            decimale = converteDecimale - 50;
        }
        else if (converteDecimale == 100) {
            numeroRomano = "C";
            decimale = converteDecimale - 100;
        }
        else if (converteDecimale == 500) {
            numeroRomano = "D";
            decimale = converteDecimale - 500;
        }
        else if (converteDecimale == 1000) {
            numeroRomano = "M";
            decimale = converteDecimale - 1000;
        }
        if (converteDecimale >= 30 && converteDecimale < 40){
            if (converteDecimale > 35) {
                numeroRomano = "XXXV";
                decimale = converteDecimale - 30;
            }
        } else if (converteDecimale < 50) {
            if (converteDecimale >= 10 && converteDecimale < 20) {
                numeroRomano = "X";
                decimale = converteDecimale - 10;
            }
            else if (converteDecimale >= 20) {
                numeroRomano = "XX";
                decimale = converteDecimale - 20; 
            }
            else decimale = converteDecimale;
        } else if (converteDecimale >= 70 && converteDecimale < 80) {
            numeroRomano = "LXX";
            decimale = converteDecimale - 70;
        } else if (converteDecimale < 100) {
            if (converteDecimale < 60) {
                numeroRomano = "L";
                decimale = converteDecimale - 50;
            }
            else if (converteDecimale >= 60 && converteDecimale < 70) {
                numeroRomano = "LX";
                decimale = converteDecimale - 10;
            }
            else if (converteDecimale >= 80) {
                numeroRomano = "LXX";
                decimale = converteDecimale - 20; 
            }
        }
        else if (converteDecimale > 100) {
            numeroRomano = "C";
            decimale = converteDecimale - 100;
        }
        else if (converteDecimale >= 90) {
            numeroRomano = "XC";
            decimale = converteDecimale - 90;
        }

        switch (decimale) {
            case 0:
                break;
            case 1:
                numeroRomano += "I";
                break;
            case 2:
                numeroRomano += "II";
                break;
            case 3:
                numeroRomano += "III";
                break;
            case 4:
                numeroRomano += "IV";
                break;
            case 5:
                numeroRomano += "V";
                break;
            case 6:
                numeroRomano += "VI";
                break;
            case 7:
                numeroRomano += "VII";
                break;
            case 8:
                numeroRomano += "VIII";
                break;
            case 9:
                numeroRomano += "IX";
                break;
        
            default:
                numeroRomano = "Digita un numero positivo!";
        }
    }
}
