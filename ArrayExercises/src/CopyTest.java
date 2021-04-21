public class CopyTest {
    private ArrayTasks arrayFiller;
    private int[] a, b;

    public CopyTest() {
        this.arrayFiller = new ArrayTest();
        arrayFiller.fillRandom(); 
        this.a = arrayFiller.getValues();
    }

    public int[] getA() { return this.a; }
    public int[] getB() { return this.b; }
}