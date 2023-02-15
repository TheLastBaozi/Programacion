
import java.util.Scanner;

/**
 * LOS ENUNCIADOS DEL PROFE TIENE DEMASIADOS ESPACIOS... ESTO ES PARA ELIMINAR ESPACIOS EXTRAS :P
 */

public class Borrado_de_enunciado {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Frase para borrar los espacios extras : ");
        String fraseCorrecta = "", demasiadosEspacios = input.nextLine();

        for (int position = 0; position < demasiadosEspacios.length() - 1; position++) {
            fraseCorrecta += (demasiadosEspacios.charAt(position) == ' ') ? ((demasiadosEspacios.charAt(position + 1) == ' ') ? "" : " ") : demasiadosEspacios.charAt((position));
        }
        System.out.println(fraseCorrecta);
    }
}

/*
            if (demasiadosEspacios.charAt(position) == ' ') {
                if (demasiadosEspacios.charAt(position + 1) == ' ') {
                    fraseCorrecta += "";
                }else {
                    fraseCorrecta += " ";
                }
            } else {
                fraseCorrecta += demasiadosEspacios.charAt((position));
            }
            */


