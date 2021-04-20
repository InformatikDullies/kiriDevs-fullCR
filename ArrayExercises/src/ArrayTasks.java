public class ArrayTasks {
    int[] a;

    public ArrayTasks() {
        this.a = new int[20];
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

}