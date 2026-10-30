import javax.swing.*;

public class LongitudI {
    public static void main(String[] args) {
        String frase = "hola como estas hoy";

        int k = 4;

        System.out.println(comprueba(frase, k));
    }

    public static int comprueba( String frase, int k) {
        int cuantas = 0;
        String[] palabras = frase.split("\\s+");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == k) {
                cuantas++;
            }
        }

        return cuantas;
    }


}
