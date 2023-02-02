
import java.util.ArrayList;
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
        } while (!isAnInteger(toCheck) || Integer.parseInt(toCheck) <= 0);

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

        for (int position :
                numbaList) {
            System.out.print(position + " ,");
        }
        System.out.println();

        ArrayList<int[]> indexedSubArray = new ArrayList<>();

        for (int listPosition = 0; listPosition < numbaList.length; listPosition++) {

            for (int lastSubArrayPosition = listPosition; lastSubArrayPosition < numbaList.length; lastSubArrayPosition++) {
                int temporal = 0;

                for (int position = listPosition; position < lastSubArrayPosition; position++) {
                    temporal += numbaList[position];

                    if (temporal == toSearch) {
                        boolean notPrinted = true;
                        for (int[] subIndexed :
                                indexedSubArray) {
                            if (listPosition == subIndexed[0] && position == subIndexed[1]) {
                                notPrinted = false;
                                break;
                            }
                        }
                        if (notPrinted) {
                            indexedSubArray.add(new int[]{listPosition, position});
                            System.out.print("List number : ");
                            for (int printPosition = listPosition; printPosition <= position; printPosition++) {
                                System.out.print(numbaList[printPosition] + " ");
                            }
                            System.out.println();
                        }

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
