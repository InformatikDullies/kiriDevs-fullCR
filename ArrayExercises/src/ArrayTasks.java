import java.util.Random;

public class ArrayTasks {
    int[] a;

    public ArrayTasks() {
        this.a = new int[20];
    }

    public int[] getValues() {
        return this.a;
    }

    public void fillAscending() {
        for (int i = 0; i < this.a.length; i++) {
            int value = i + 1;
            this.a[i] = value;
        }
    }

    public void fillDescending() {
        for (int i = 0; i < this.a.length; i++) {
            int value = this.a.length - i;
            this.a[i] = value;
        }
    }

    public void fillRandom() {
        Random randomGen = new Random();
        for (int i = 0; i < this.a.length; i++) {
            int generatedNumber = randomGen.nextInt(20);
            int newValue = generatedNumber + 1;
            this.a[i] = newValue;
        }
    }

    public void invert() {
        int[] invertedArray = new int[this.a.length];
        int lastIndex = this.a.length - 1;
        for (int i = 0; i < this.a.length; i++) {
            int newIndex = lastIndex - i; // Calculate new position of the value

            invertedArray[newIndex] = this.a[i]; // Place the value into it's new position
        }

        this.a = invertedArray; // Update a with the new order
    }

    public int minimum() {
        Integer min = null;

        for (int value : this.a) {
            if (min == null) { min = value; }
            if (value < min) { min = value; }
        }

        if (min == null) { return 0; }
        else { return min; }
    }

    public boolean contains(int numberToSearch) {
        if ((numberToSearch < 1) || (numberToSearch > 20)) {
            return false;
        }

        for (int value : this.a) {
            if (value == numberToSearch) { return true; }
        }
        return false;
    }
}
