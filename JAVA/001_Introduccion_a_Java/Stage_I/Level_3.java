

import java.util.Scanner;

/**
 * <h1>Multiplicaciones</h1>
 *  Escribe un programa que pregunte al usuario tres números, y
 *  muestre la suma del primero más el segundo,
 *  multiplicado por el tercero.
 */
public class Level_3 {
    public static void main(String[] args) {

        //Declare the variables
        Scanner input=new Scanner(System.in);
        int numberOne;
        int numberTwo;
        int numberThree;

        //Time to ask the three numbers
        //First number -> input -> numberOne
        System.out.println("Dime el primer número");
            numberOne=input.nextInt();

        //Second number -> input -> numberTwo
        System.out.println("Dime el segundo número");
            numberTwo=input.nextInt();

        //Third number -> input -> numberThree
        System.out.println("Dime el tercer número");
            numberThree=input.nextInt();

        //We have the numbers... just need to do tha math
        //Need to declare the new variable for the math
        int addition;
        int total;

        //Made first operation (Addition)
        addition = numberOne + numberTwo;
        //Now we made the multiply
        total = addition*numberThree;

        //Show the result
        System.out.println("El número final es " + total);

    }
}
