public class Invertida {
    public static void main(String[] args) {
        String frase= "hola como estas";
        System.out.println(invertir(frase));
    }
    public static String invertir(String frase) {
        String[] palabras = frase.split(" ");
        String invertido= "";
        for(int i=palabras.length-1;i>=0;i--){
            invertido=invertido + palabras[i] + " ";
        }
        return invertido;
    }
}

