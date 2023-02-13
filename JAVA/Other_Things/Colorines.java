/**
 * <h1>COLORINES</h1>
 * Mira... java está escrito en ANSI, si estás en IntelliJ IDEA made by JetBrains...
 * creo que podrías ver abajo a la izquierda UTF-8
 * <p>
 * Verdad...?
 * <p>
 * ANSI UTF-8... Te suena?
 * Si no entiendes : <a href="https://developer.mozilla.org/es/docs/Glossary/UTF-8">Sussy LINK</a>
 * <p>
 * Sin más que decir... vamos a la explicación
 */
public class Colorines {
    public static void main(String[] args) {

        //--------------------- TEXTOS --------------------

        // Esto es un texto sin colores :
        System.out.println("Remember that in Java Programming the background color and text color of the output screen is black or white by default. If we want to Highlight some text on the output screen then we can use the ANSI color codes and highlight the particular text. One can refer to the ANSI escape code in order to explore more.");

        // Esto es lo mismo de arriba... pero visualmente para el usuario es más bonito...
        System.out.println("Remember that in Java Programming the background color and text color " +
                "of the output screen is black or white by default. " +
                "If we want to Highlight some text on the output screen " +
                "then we can use the ANSI color codes and highlight the particular text." +
                "One can refer to the ANSI escape code in order to explore more.");

        // Como verás puedes poner \n para saltos de línea... esto lo explico el profe... verdad?
        // Si no te acuerdas... puedes visitar : https://www.javatpoint.com/java-escape-characters
        System.out.println("Remember that in Java Programming the background color and text color\n " +
                "of the output screen is black or white by default. \n" +
                "If we want to Highlight some text on the output screen " +
                "then we can use the ANSI color codes and highlight the particular text.\n" +
                "One can refer to the ANSI escape code in order to explore more.\n");

        // También funciona como bloque de notas... con las tres comillas dobles """ se abre un bloque de texto y lo que escribas sale
        // Se cierra con """ las tres comillas... tiene sentido, no?
        // Lo malo de aquí es que no puedes poner variables... los demás sí
        System.out.println("""
                Remember that in Java Programming the background color and text color
                of the output screen is black or white by default.
                If we want to Highlight some text on the output screen then we can use the ANSI color codes and highlight the particular text.
                One can refer to the ANSI escape code in order to explore more.
                """);

        //--------------------- TEXTOS CON COLORES --------------------

        // Supongo que sabes ya que es ANSI... Sip, definitivamente si no lo sabes te has leído el enlace antes de abrir la clase

        // Si ponemos : cosas como esto salen colores...
        System.out.println("Remember that in Java Programming the background color and text color \n" +
                "of the output screen is black or white by default. \n" +
                "If we want to Highlight \u001B[31m some text on the output screen \n" +
                "then we can use the\u001B[0m ANSI color codes and highlight the particular text. \n" +
                "One can refer to the ANSI escape \u001B[35m code in order to explore more.\n");


        // Ahora... esto es más fácil de ver... no?
        // RED_COLOR es una función / método... o atributo ( Mejor llamarlo atributo ) está al fondo del código esto:
        System.out.println(RED_COLOR + "H" + PINK_COLOR + "E" + RED_COLOR + "LLO" + RESET_COLOR + "!!!!!!!");


        // For para los colores de texto :
        for (int position = 30; position <= 37; position++) {
            System.out.println("This a simple phrase...\u001B[" + position + "m just for an example.... :3");
        }

        // Oh oh oh espera... porque sigue el color?
        System.out.println("This a simple phrase... just for an example.... :3");
        System.out.println("This a simple phrase... just for an example.... :3");
        System.out.println("This a simple phrase... just for an example.... :3\u001B[0m"); // Parece que ya se ha puesto de default...
        System.out.println("This a simple phrase... just for an example.... :3");
        System.out.println("This a simple phrase... just for an example.... :3");

        // Si no reseteas el ansi color, el resto seguirá del color que le pusiste, es como etiquetado, si no lo cierras sigues en la etiqueta


        // Un poco de background :
        for (int position = 40; position <= 47; position++) {
            System.out.println("This a simple phrase...\u001B[" + (position - 1) + "m");
            System.out.println("This a simple phrase...\u001B[" + position + "m just for an example.... :3");
        }

        // Con atributos para que sea más fácil de ver y escribir y recordar no? sería hacer un paquete en el proyecto con los colores...
        // Hacerlo publico para el proyecto entero y pum... no tienes ni que copiarlo, de hecho lo voy a hacer ahora cuando tenga algo de tiempo
        // libre para hacer otras cosas, o tal vez cuando no tenga ni tiempo xD
        System.out.println("\n\n\n"+GREEN_BG_COLOR + "H" + PURPLE_BG_COLOR + "E" + RED_COLOR+PURPLE_BG_COLOR + "LLO" + RESET_COLOR + "!!!!!!!");
    }


    /**
     * Resetea el color al defecto tanto text y backdground (Fondo)
     */
    public static final String RESET_COLOR = "\u001B[0m";

    // -------------- TEXT COLOR -----
    /**
     * Lo siguiente es color rosita... espero que salga rosa en tu terminal ;3
     */
    public static final String PINK_COLOR = "\u001B[31m";


    /**
     * Lo siguiente es rojo rosita... espero que salga rojo en tu terminal ;3
     */
    public static final String RED_COLOR = "\u001B[35m";

    // -------------- BACKGROUND COLOR -----
    /**
     * Lo siguiente es color verde para el fondo... espero que salga verde en tu terminal ;3
     */
    public static final String GREEN_BG_COLOR = "\\u001B[42m";
    /**
     * Lo siguiente es color morado para el fondo... espero que salga morado en tu terminal ;3
     */
    public static final String PURPLE_BG_COLOR = "\\u001B[45m";


    // Hay muchas otras formas, pero espero que se te haya quedado medio claro como hacer, aún puedes ir a GOOGLE-CHAN para consultar
    // MEJORES IDEAS

    //
}