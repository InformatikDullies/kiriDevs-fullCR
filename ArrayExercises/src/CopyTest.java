public class CopyTest {
    private ArrayTasks arrayFiller;
    private int[] a, b;

    public CopyTest() {
        this.arrayFiller = new ArrayTasks();
        arrayFiller.fillRandom(); 
        this.a = arrayFiller.getValues();
    }

    public int[] getA() { return this.a; }
    public int[] getB() { return this.b; }

    public void copyTest() {
        // Obviously doesn't work, but it's a task so...
        this.b = this.a;
    }

    public void copyArray(int[] original) {
        for (int i = 0; i < original.length; i++) {
            this.b[i] = original[i];
        }
    }
}