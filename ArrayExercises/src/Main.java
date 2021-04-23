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

    private static void testArrayCalculation() {
        System.out.println("Now testing ArrayCalculation");

        // Generating sample numbers
        ArrayCalculation arrayCalculation = new ArrayCalculation();
        System.out.println(Arrays.toString(arrayCalculation.getValues()));

        // Testing sum()
        int sum = arrayCalculation.sum();
        System.out.println("  Sum: " + sum);

        // Testing even/odd number counting
        int even = arrayCalculation.countEven();
        int odd = arrayCalculation.countOdd();
        System.out.println(" Even: " + even);
        System.out.println("  Odd: " + odd);

        // Testing pair detection
        int pairs = arrayCalculation.countPairs();
        System.out.println("Pairs: " + pairs);
    }

    private static void testCopyTest() {
        System.out.println("Now testing CopyTest");

        // Create 1st CopyTest instance for testing
        CopyTest copyTest1 = new CopyTest();
        System.out.println("copyTest1.a:");
        System.out.println(Arrays.toString(copyTest1.getA()));

        // Doing the stupid thing with b = a
        System.out.println("Doing the stupid thing with b = a, changing b[0] to 10.000");
        copyTest1.copyTest();

        // Extracting a and b from copyTest1
        int[] a1 = copyTest1.getA();
        int[] b1 = copyTest1.getB();

        // Doing a change so you can see it happen in both instances
        b1[0] = 10000;

        // Printing out results
        System.out.println("A: " + Arrays.toString(a1));
        System.out.println("B: " + Arrays.toString(b1));

        // Create 2nd CopyTest instance for testing and printing original numbers
        CopyTest copyTest2 = new CopyTest();
        System.out.println("copyTest2.a:");
        System.out.println(Arrays.toString(copyTest2.getA()));

        // Actually copying a into b:
        System.out.println("Actually copying a into b, changing b[0] to 10.000");
        copyTest2.copyArray(copyTest2.getA());

        // Extracting a and b from copyTest2
        int[] a2 = copyTest2.getA();
        int[] b2 = copyTest2.getB();

        // Doing a change so you can see it happen in only b here
        b2[0] = 10000;

        // Printing out results
        System.out.println("A: " + Arrays.toString(a2));
        System.out.println("B: " + Arrays.toString(b2));
    }

    private static void testRandomTest() {
        System.out.println("Now testing RandomTest");

        // Create testing instance
        RandomTest randomTest = new RandomTest();

        // Getting values
        int[] rawNumbers = randomTest.getNumbers();
        int[] quantities = randomTest.quantify();

        // Printing results
        System.out.println("===== RAW NUMBERS =====");
        System.out.println(Arrays.toString(rawNumbers));
        System.out.println("===== END RAW NUMBERS =====");
        System.out.println("===== QUANTITIES =====");
        System.out.println(Arrays.toString(quantities));
        System.out.println("===== END QUANTITIES =====");
    }

    public static void main(String[] args) {
        testArrayTasks();
        for (int i = 0; i < 3; i++) { System.out.println(); }
        testArrayCalculation();
        for (int i = 0; i < 3; i++) { System.out.println(); }
        testCopyTest();
        for (int i = 0; i < 3; i++) { System.out.println(); }
        testRandomTest();
    }
}
