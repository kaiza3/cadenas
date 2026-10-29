import java.util.Scanner;

public class NombreUsuario {
    public static void main(String[] args) {
        String nombre = "JUAn perez LOPEZ";
        String[] partes =nombre.split(" ");
        for(int i=0;i<partes.length;i++){
            partes[i]=partes[i].substring(0,1).toUpperCase() +
                    partes[i].substring(1).toLowerCase();
        }
        for(int i=0;i<partes.length;i++){
            System.out.print(partes[i] + " ");

        }


    }
}
