public class Main {
    public static void main(String[] args) {
        Run testRun = new Run(6);

        testRun.setTime(10.18, 1);
        testRun.setTime(10.12, 2);
        testRun.setTime(10.21, 3);
        testRun.setTime(10.25, 4);
        testRun.setTime(10.27, 5);
        testRun.setTime(10.32, 6);

        boolean isOrdered = testRun.isOrdered();
        System.out.println("Times are properly ordered: " + isOrdered);

        if (isOrdered) {
            boolean couldPrintTimes = testRun.printAllTimes();
            if (!couldPrintTimes) {
                System.out.println("Couldn't print times: Not all times were filled yet!");
            }
        }

        double averageTime = testRun.calculateAverageTime();
        System.out.println("Average time: " + averageTime);
    }
}
