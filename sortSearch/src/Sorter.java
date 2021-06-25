public class Sorter {
    int[] toSort;

    public Sorter(int[] toSort) {
        this.toSort = toSort;
    }

    public void insertionSort() {
        // Omitted
    }

    /* This getter is not required since we don't copy the array
     * and therefore write to the pointer that can also be used
     * to get the result by the user.

    public int[] getResult() {
        return this.toSort;
    }
    */
}