/**
 * The ClassTest class describes a test that was taken by a SchoolClass
 * and can be used to save a number of score values to then find the largest number
 */
public class ClassTest {
    @SuppressWarnings("FieldMayBeFinal")
    private int[] values;
    private int indexToFill = 0;

    /**
     * The constructor of the ClassTest class.
     * Returns a new ClassTest object (duh!)
     *
     * @param classWritingTheTest The class that is taking the test.
     *                            The number of students will determine
     *                            the number of values that can be stored.
     */
    public ClassTest(SchoolClass classWritingTheTest) {
        this.values = new int[classWritingTheTest.getNumberOfStudents()];
    }

    public void addValue(int valueToSave) {
        if (this.values.length <= indexToFill) {
            // The Array is already full
            throw new IllegalArgumentException("The number of vales that can be saved is already reached.");
        }

        this.values[this.indexToFill] = valueToSave; // Append to the end
        this.indexToFill++; // Increment "end index counter"
    }

    public int getLargestNumberValue() {
        Integer largestValue = null;
        for (int value : this.values) {
            // Make sure the first value is the the first largestValue
            if (largestValue == null) {
                largestValue = value;
                continue;
            }

            if (value > largestValue) {
                largestValue = value;
            }
        }

        // Throw exception if no values were added - otherwise return largest one.
        if (largestValue == null) { return 0; }
        else { return largestValue; }
    }

    public int getLargestNumberIndex() {
        Integer largestValue = null;
        Integer largestIndex = null;
        for (int i = 0; i < this.values.length; i++) {
            int value = this.values[i];

            // Make sure the first value is the the first largestValue
            if (largestValue == null) {
                largestValue = value;
                largestIndex = i;
                continue;
            }

            if (value > largestValue) {
                largestValue = value;
                largestIndex = i;
            }
        }

        // Throw exception if no values were added - otherwise return index of largest number.
        if (largestValue == null) { return -1; }
        else { return largestIndex; }
    }
}
