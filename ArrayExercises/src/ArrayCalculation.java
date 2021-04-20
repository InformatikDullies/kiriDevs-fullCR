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

    public int countEven() {
        int evenAmount = 0;
        for (int number : this.a) {
            if (number % 2 == 0) {
                evenAmount++;
            }
        }
        return evenAmount;
    }

    public int countOdd() {
        int totalAmount = this.a.length;
        int evenNumbers = this.countEven();

        return totalAmount - evenNumbers;
    }
}
