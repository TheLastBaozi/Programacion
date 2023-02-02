
import  java.util.Scanner;

/**
 * <h1>Dividir la cena</h1>
 * Escribe un programa que pregunte al usuario el precio de  la cuenta de la cena,
 * pregunte cuantos habeis cenado,
 * y nos muestre cuanto tiene que pagar cada uno
 */
public class Level_4 {
    public static void main(String[] args) {

        //Declare de variables
        Scanner input = new Scanner(System.in);
        double totalDinnerPrice;
        int people;

        //Ask the first variable (How much is the price for the dinner?
        System.out.println("¿Cuánto vale el total de la cena?");
            totalDinnerPrice=input.nextDouble();

        //Ask how many people there is in the dineer
        System.out.println("¿Cuántas personas han cenado?");
            people=input.nextInt();

        //And made the math
        double price;
        price = totalDinnerPrice / people;


        //Show the result
        System.out.println(price);

    }









}
