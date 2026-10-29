import java.util.Locale;

public class Palindromo {
    public static void main(String[] args) {
        String frase= "Anita lava la tina";
        String invertido="";

        for(int i=frase.length()-1;i>=0;i--){
            invertido=invertido+frase.charAt(i);

        }
        System.out.println(invertido);

        String frasesinespacio= frase.replace(" ","").toLowerCase();
        String insinespacio= invertido.replace(" ", "").toLowerCase();

        if (frasesinespacio.equals(insinespacio)){
            System.out.println("Palindromo: si");
        }else{
            System.out.println("Palindromo: no");
        }
    }
}
