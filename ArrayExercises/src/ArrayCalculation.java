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

    public int sum() {
        int total = 0;

        // Iterate over all saved values
        for (int value : this.a) {
            total += value;
        }

        return total;
    }
}
