
import java.util.Scanner;

/**
 * <h1>Hola Usuario 2.0!! </h1>
 * Realiza un programa que pregunte al usuario por su nombre y apellidos
 * y muestre por pantalla “Buenos dias [nombre] [apellidos]”
 */
public class Level_2 {
    public static void main(String[] args) {

        //Declare the variables
        Scanner input = new Scanner(System.in);
        String firstName;
        String lastName;

        //Ask for the name
        System.out.println("¿Cuál es tu nombre?");
        firstName = input.nextLine();

        //Ask for the last name
        System.out.println("¿Cuál es tu apellido?");
        lastName = input.nextLine();

        //Show the result
        System.out.println("Buenos días " + firstName + " " + lastName);
    }


}
