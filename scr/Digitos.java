import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        String frase = " 12345 hola 678";

        System.out.println("hay " + cuantosSonDigitos(frase)+ " digitos");
    }
    public static int cuantosSonDigitos(String frase){
        int digitos = 0;
        for (int i = 0; i <=frase.length()-1 ; i++){
            if (Character.isDigit(frase.charAt(i))){
                digitos = digitos + 1;
            }
        }
        return digitos;
    }
}
