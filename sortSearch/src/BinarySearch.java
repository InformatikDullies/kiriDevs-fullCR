public class BinarySearch {
    int[] searchArray;

    public BinarySearch(int[] searchArray) {
        if (!(searchArray instanceof int[])) {
            throw new IllegalArgumentException();
        }

        // Copy the Array instead of working with the pointer
        this.searchArray = new int[searchArray.length];
        for (int i = 0; i < searchArray.length; i++) {
            this.searchArray[i] = searchArray[i];
        }
    }

    /**
     * Searches for the given number in the search array.
     * Will not return the result, but save it to the object.
     * 
     * @param toFind The number to search for
     */
    public Integer searchFor(int toFind) {
        int[] a = this.searchArray; // Getting a pointer for easier access

        int lowerBound = 0;
        int upperBound = a.length;
        int checkIndex;

        int searchIteration = 1;
        while (lowerBound <= upperBound) {
            System.out.println(toFind + ": Starte " + searchIteration + ". Iteration.");

            // Calculating the index to check at
            int sumLowUp = lowerBound + upperBound;
            checkIndex = (sumLowUp / 2) - ((sumLowUp % 2) / 2); // mefs

            System.out.println(toFind + ": LowerBound " + lowerBound + ", UpperBound " + upperBound + " - checking index " + checkIndex);

            if ((checkIndex >= a.length) || (checkIndex < 0)) {
                // We are trying to check out of bounds
                return null;
            }

            int num = a[checkIndex];
            if (num == toFind)
                return checkIndex; // Stop execution and return the result
            else if (num < toFind)
                lowerBound = checkIndex + 1;
            else // if (num > toFind)
                upperBound = checkIndex - 1;

            searchIteration++;
        }

        // Return null if the number wasn't found
        return null;
    }
}