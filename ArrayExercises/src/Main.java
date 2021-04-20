import java.util.Arrays;

public class Main {
    private static void testArrayTasks() {
        System.out.println("Now testing ArrayTasks...");

        // Testing ascending filling
        System.out.println("ArrayTasks#fillAscending()");
        ArrayTasks ascendingArrayTasks = new ArrayTasks();
        ascendingArrayTasks.fillAscending();
        System.out.println(Arrays.toString(ascendingArrayTasks.getValues()));

        // Testing descending filling
        System.out.println("ArrayTasks#fillDescending()");
        ArrayTasks descendingArrayTasks = new ArrayTasks();
        descendingArrayTasks.fillDescending();
        System.out.println(Arrays.toString(descendingArrayTasks.getValues()));

        // Testing random filling
        System.out.println("ArrayTasks#fillRandom()");
        ArrayTasks randomArrayTasks = new ArrayTasks();
        randomArrayTasks.fillRandom();
        System.out.println(Arrays.toString(randomArrayTasks.getValues()));

        // Testing reversing with random filling
        System.out.println("ArrayTasks#invert() - on #fillRandom()");
        ArrayTasks invertArrayTasks = new ArrayTasks();
        invertArrayTasks.fillRandom();
        System.out.println(Arrays.toString(invertArrayTasks.getValues()));
        invertArrayTasks.invert();
        System.out.println(Arrays.toString(invertArrayTasks.getValues()));

        // Testing minimum with random filling
        System.out.println("ArrayTask#minimum() - on #fillRandom()");
        ArrayTasks minimumArrayTasks = new ArrayTasks();
        minimumArrayTasks.fillRandom();
        System.out.println(Arrays.toString(minimumArrayTasks.getValues()));
        System.out.println("Minimum: " + minimumArrayTasks.minimum());
    }

    public static void main(String[] args) {
        testArrayTasks();
    }
}
