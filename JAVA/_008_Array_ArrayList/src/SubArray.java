
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SubArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String toCheck;
        do {
            System.out.print("Tell me how many number do you want in the vector ( > 0 ):");
            toCheck = input.nextLine();
            if (!isAnInteger(toCheck)) System.out.println("Not a valid number... please repeat");
        } while (!isAnInteger(toCheck) || Integer.parseInt(toCheck) <=0);

        int[] numbaList = new int[Integer.parseInt(toCheck)];
        System.out.println("Vector Successfully created");

        for (int position = 0; position < numbaList.length; position++) {
            numbaList[position] = ThreadLocalRandom.current().nextInt(-5, (5 + 1));
        }
        System.out.println("Vector Successfully Filled");

        do {
            System.out.print("Tell me the number you want to search :");
            toCheck = input.nextLine();
        } while (!isAnInteger(toCheck));
        int toSearch = Integer.parseInt(toCheck);


        // We want to traverse the entire Array
        // Queremos recorrer el Array por completo
        for (int listPosition = 0; listPosition < numbaList.length; listPosition++) {
            // Temporally stored numbers
            int temporal = 0;
            // In reverse to position
            for (int lastPosition = numbaList.length; lastPosition > listPosition; lastPosition--) {

                for (int position = listPosition; position < lastPosition; position++) {
                    // FIXME: COMPLETE HERE

                    if (temporal == toSearch) {
                        // FIXME: System Print here
                        // Suggestion : FOR if u don't want store it in a String
                    }
                }
            }
        }



    }

    private static boolean isAnInteger(String numbaToCheck) {
        if (numbaToCheck.matches("-?\\d+")) {
            if (numbaToCheck.length() >= 10) {
                // FIXME: Negative number didn't checked
                return numbaToCheck.compareTo("2147483647") <= 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
