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
     * Searches for the given number in the search array iteratively.
     * Will not return the result, but save it to the object.
     * 
     * @param toFind The number to search for
     */
    public Integer iterative(int toFind) {
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

    private Integer recursive(int lowerBound, int upperBound, int toFind, int runNumber) throws IllegalAccessException {
        // Get easier access to the search array
        int[] a = this.searchArray;

        System.out.println(toFind + ": Starting " + runNumber + ". run");

        throw new IllegalAccessException("Not implemented.");
    }

    /**
     * Searches for the given number in the search array recursively .
     * Will not return the result, but save it to the object.
     * 
     * @param toFind The number to search for
     */
    public Integer recursiveLauncher(int toFind) throws IllegalAccessException {
        // Define starting bounds
        int lowerBound = 0;
        int upperBound = this.searchArray.length - 1;

        // Actually run the recursive algorithm and pass the result through
        return this.recursive(lowerBound, upperBound, toFind, 0);
    }
}