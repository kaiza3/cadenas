public class Analizar {
    public static void main(String[] args) {
        String cadena = "Programacion";
        System.out.println("lon: " + cadena.length());
        System.out.println("1 letra: " + cadena.charAt(0));
        System.out.println("ultima letra: " + cadena.charAt(cadena.length() - 1));
        System.out.println("mayus: " + cadena.toUpperCase());
        System.out.println("minus: " + cadena.toLowerCase());
        int vocales=0;
        for (int i = 0; i <= cadena.length() - 1; i++) {
            if(cadena.charAt(i)== 'a') {
                vocales++;

            }
        }
        System.out.println("cuantas 'a': " + vocales);

    }

}
