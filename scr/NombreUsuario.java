import java.util.Locale;
import java.util.Scanner;

public class NombreUsuario {
    public static void main(String[] args) {
        String nombre = "JUAn perez LOPEZ";
        String[] partes = nombre.split(" ");
        for (int i = 0; i < partes.length; i++) {
            partes[i] = partes[i].substring(0, 1).toUpperCase() +
                    partes[i].substring(1).toLowerCase();
        }
        System.out.println("nombre form: ");
        for (int j = 0; j < partes.length; j++){
            System.out.print(partes[j] + " ");
        }
        System.out.println();
        System.out.print("ini: ");
        for (int j = 0; j < partes.length; j++) {
            System.out.print(partes[j].charAt(0) + ".");
        }
        System.out.println();
        String usuario = partes[0].substring(0, 1);
        usuario += partes[1];
        usuario+= partes[2].substring(0,1);
        usuario = usuario.toLowerCase();
        System.out.println("usuario: " + usuario);


    }
}

