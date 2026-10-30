import java.util.Locale;

public class Siglas {
    public static void main(String[] args) {
        String frase = "Escuela Oficial de Idiomas";
        int siglas;
        String[] palabras = frase.split("\\s+");;
        for (int i=0; i <palabras.length; i++){

            System.out.print(palabras[i].charAt(0) + ".");
        }
    }
}
