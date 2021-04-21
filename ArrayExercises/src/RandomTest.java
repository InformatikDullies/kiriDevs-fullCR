import java.util.Random;

public class RandomTest {
    private int[] a;
    private Random randomGen;

    public RandomTest() {
        this.a = new int[100000];
        this.randomGen = new Random();

        for (int i = 0; i < 100000; i++) {
            this.a[i] = randomGen.nextInt(100);
        }

        System.out.println(Arrays.toString(this.a));
    }

    public int[] quantify() {
        int[] quantities = new int[100];
        for (int value : this.a) {
            quantities[value]++;
        }
        return quantities;
    }
}