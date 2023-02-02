import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SubArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String toCheck;
        do {
            System.out.print("Tell me how many number do you want in the vector ( > 0 ):");
            toCheck = input.nextLine();
            if (!isAnPositiveInteger(toCheck)) System.out.println("Not a valid number... please repeat");
        } while (!isAnPositiveInteger(toCheck));

        int[] numbaList = new int[Integer.parseInt(toCheck)];
        System.out.println("Vector Successfully created");

        for (int position = 0; position < numbaList.length; position++) {
            numbaList[position] = ThreadLocalRandom.current().nextInt(-5, (5 + 1));
        }
        System.out.println("Vector Successfully Filled");

        do {
            System.out.print("Tell me the number you want to search :");
            toCheck = input.nextLine();
        } while (!isAnPositiveInteger(toCheck));

    }

    private static boolean isAnPositiveInteger(String numbaToCheck) {
        if (numbaToCheck.matches("\\d+")) {
            if (numbaToCheck.length() >= 10) {
                return numbaToCheck.compareTo("2147483647") <= 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
