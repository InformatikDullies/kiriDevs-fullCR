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
}
