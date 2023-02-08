
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * <h2>SubArray number Sum check</h2>
 * Program Requirement:
 * - Create a n long vector with integer
 * - Fill the vector with random number between -5 and 5
 * - Ask the number to search
 * - Print all the occurrences
 */
public class SubArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String toCheck;

        do {
            System.out.print("Tell me how many number do you want in the vector ( > 0 ):");
            toCheck = input.nextLine();
            if (!isAnInteger(toCheck)) System.out.println("Not a valid number... please repeat");
        } while (!isAnInteger(toCheck) || Integer.parseInt(toCheck) <= 0);

        // Create the vector with toCheck long
        int[] numbaList = new int[Integer.parseInt(toCheck)];
        System.out.println("Vector Successfully created");

        // Fill the array with random numbers
        for (int position = 0; position < numbaList.length; position++) {
            numbaList[position] = ThreadLocalRandom.current().nextInt(-5, (5 + 1));
        }
        System.out.println("Vector Successfully Filled");

        // Ask for the number to search
        do {
            System.out.print("Tell me the number you want to search :");
            toCheck = input.nextLine();
        } while (!isAnInteger(toCheck));
        int toSearch = Integer.parseInt(toCheck);

        // Print the vector, so we can see what is stored in the vector
        for (int position : numbaList) {
            System.out.print(position + " ");
        }
        System.out.println();

        // Array to store the index of SubArrays that is already printed... so we don't print it twice
        ArrayList<int[]> indexedSubArray = new ArrayList<>();

        boolean notOccurrence = true;

        // The first SubArray index
        for (int listPosition = 0; listPosition < numbaList.length; listPosition++) {
            // The End of the SubArray
            for (int lastSubArrayPosition = listPosition; lastSubArrayPosition < numbaList.length; lastSubArrayPosition++) {
                int temporal = 0;
                // Add the number between First Index and the End
                for (int position = listPosition; position < lastSubArrayPosition; position++) {
                    temporal += numbaList[position];
                    // If is the same number... try print it
                    if (temporal == toSearch) {
                        // Make a boolean to check if is printed or not
                        boolean notPrinted = true;
                        // Search we already stored the exactly two index in the list
                        for (int[] subIndexed : indexedSubArray) {

                            if (listPosition == subIndexed[0] && position == subIndexed[1]) {
                                notPrinted = false;
                                // Break... because not necessarily
                                break;
                            }
                        }
                        // If is not printed we print it
                        if (notPrinted) {
                            indexedSubArray.add(new int[]{listPosition, position});
                            System.out.print("List number : ");
                            for (int printPosition = listPosition; printPosition <= position; printPosition++) {
                                System.out.print(numbaList[printPosition] + " ");
                            }
                            System.out.println();
                            notOccurrence = false;
                        }
                    }
                }
            }
        }

        // Better than nothing... user can know if there is not SubArray
        if (notOccurrence) System.out.println(" No SubArray founded");

        // Extra: Search the smaller SubArray and the largest SubArray
        int[] smaller = new int[]{indexedSubArray.get(0)[0], indexedSubArray.get(0)[1]};
        int[] largest = new int[]{indexedSubArray.get(0)[0], indexedSubArray.get(0)[1]};

        // Find the smaller and largest subArray distance
        for (int[] subArray : indexedSubArray) {
            if (smaller[1]-smaller[0]>subArray[1]-subArray[0]){
                smaller[0] = subArray[0];
                smaller[1] = subArray[1];
            }
            if (largest[1]-largest[0]<subArray[1]-subArray[0]){
                largest[0] = subArray[0];
                largest[1] = subArray[1];
            }
        }


        ArrayList<ArrayList> indexedInArrayList = new ArrayList<>();
        for (int position = 0; position < indexedSubArray.size(); position++) {
            indexedInArrayList.get(position).add(indexedSubArray.get(position)[0]);
            indexedInArrayList.get(position).add(indexedSubArray.get(position)[1]);
        }
//        for (int position = 0; position < indexedInArrayList.size(); position++) {
//            Iterator subArrayIT = indexedInArrayList.get(position).iterator();
//            if (smaller[1]-smaller[0]>subArrayIT-subArrayIT.next());
//        }

        // Print the Smaller and largest SubArray
        System.out.println("Smaller SubArray : ");
        for (int position = smaller[0]; position <= smaller[1]; position++) {
            System.out.print(numbaList[position] + " ");
        }
        System.out.println();

        System.out.println("Largest SubArray : ");
        for (int position = largest[0]; position <= largest[1]; position++) {
            System.out.print(numbaList[position] + " ");
        }
        System.out.println();

    }

    private static boolean isAnInteger(String numbaToCheck) {
        if (numbaToCheck.matches("-?\\d+")) {
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
