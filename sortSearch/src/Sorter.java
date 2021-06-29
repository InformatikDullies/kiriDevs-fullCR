public class Sorter {
    int[] toSort;

    public Sorter(int[] toSort) {
        this.toSort = toSort;
    }

    public void insertionSort() {
        int i, j, temp;
        for (i = 1; i < this.toSort.length; i++) {
            j = i;
            temp = this.toSort[j];
            while ((j > 0) && (this.toSort[j-1] > temp)) {
                this.toSort[j] = this.toSort[j - 1];
                j--;
            }
        }
    }

    /* This getter is not required since we don't copy the array
     * and therefore write to the pointer that can also be used
     * to get the result by the user.

    public int[] getResult() {
        return this.toSort;
    }
    */
}