public class ArrayCalculation {
    int[] a;

    public ArrayCalculation() {
        ArrayTasks arrayFiller = new ArrayTasks();
        arrayFiller.fillRandom();
        this.a = arrayFiller.getValues();
    }

    public int[] getValues() {
        return this.a;
    }
}
