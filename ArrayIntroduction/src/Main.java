public class Main {
    private static void testRun() {
        System.out.println("Testing run...\n");
        Run loburgerWaldlauf = new Run(6);

        loburgerWaldlauf.setTime(10.18, 1);
        loburgerWaldlauf.setTime(10.12, 2);
        loburgerWaldlauf.setTime(10.21, 3);
        loburgerWaldlauf.setTime(10.25, 4);
        loburgerWaldlauf.setTime(10.27, 5);
        loburgerWaldlauf.setTime(10.32, 6);

        boolean isOrdered = loburgerWaldlauf.isOrdered();
        System.out.println("Times are properly ordered: " + isOrdered);

        if (isOrdered) {
            boolean couldPrintTimes = loburgerWaldlauf.printAllTimes();
            if (!couldPrintTimes) {
                System.out.println("Couldn't print times: Not all times were filled yet!");
            }
        }

        double averageTime = loburgerWaldlauf.calculateAverageTime();
        System.out.println("Average time: " + averageTime);
    }

    public static void main(String[] args) {
        testRun();
    }
}
