
import java.util.Scanner;

/**
 * <h1>Hola Mundo!!! </h1>
 * Realiza un programa que pregunte al usuario por su nombre, y muestre por pantalla “Buenos dias [nombre]”
 */
public class Level_1_001 {
    public static void main(String[] args) {

        //Declare the variable
        Scanner input = new Scanner(System.in);
        String name;

        //Ask name
        System.out.println("¿Cuál es tu nombre?");
        name = input.nextLine();

        //Show the result
        System.out.println("Buenos días " + name);
    }
}
