import java.util.Arrays;

public class Main {
    private static void testBinarySearch() {
        System.out.println("Now testing binary search...");

        // Creating array to search something in
        ArrayTasks binarySearchArrayTasks = new ArrayTasks();
        binarySearchArrayTasks.fillAscending();
        int[] searchArray = binarySearchArrayTasks.getValues();

        // Creating searcher with the generated array
        BinarySearch binarySearcher = new BinarySearch(searchArray);

        // Printing the array the seracher will search in
        System.out.println(Arrays.toString(searchArray));

        // Searching specified numbers and printing results
        int[] numbersToSearch = { -1, 1, 5, 10, 15, 20, 50 };
        for (int toSearch : numbersToSearch) {
            Integer indexOfNumber = binarySearcher.searchFor(toSearch);
            Util.printSearchResult(toSearch, indexOfNumber);
        }
    }

    public static void main(String[] args) {
        testBinarySearch();
    }
}