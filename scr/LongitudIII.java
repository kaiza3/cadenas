public class LongitudIII {
    public static void main(String[] args) {
        String frase = " hola que tal";
        int k = 2;

        if (comprueba(frase, k)) {
            System.out.println("hay una palabra mas larga");
        }else  {
            System.out.println("no hay una palabra mas larga");
        }
    }
    public static boolean comprueba(String frase, int k) {
        String[] palabras = frase.split("\\s+");
        boolean es_verd = false;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length()>k) {
                es_verd = true;
            }
        }
        return es_verd;
    }
}
