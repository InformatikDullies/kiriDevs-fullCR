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

    private static SchoolClass testClass() {
        System.out.println("Testing class...\n");
        SchoolClass informatikDullies = new SchoolClass(3);

        informatikDullies.addStudent("kiriDevs", 1);
        informatikDullies.addStudent("Wadzek1", 2);
        informatikDullies.addStudent("KulaJunke", 3);

        System.out.println("Class \"InformatikDullies\":");
        boolean couldPrintList = informatikDullies.printStudentList();
        if (!couldPrintList) {
            System.out.println("Couldn't print list: Not all names were filled yet!");
        }

        // Return the used school class for futher usage with the testClassTest()
        return informatikDullies;
    }

    private static void testClassTest(SchoolClass informatikDullies) {
        System.out.println("Letting the informatikDullies class write a test...\n");
        ClassTest computerScienceTest = new ClassTest(informatikDullies);

        computerScienceTest.addValue(1);
        computerScienceTest.addValue(2);
        computerScienceTest.addValue(1);
        // computerScienceTest.addValue(666); // Adding more values than allowed to test exceptions (666 because it's supposed to break things)

        int largestNumberValue = computerScienceTest.getLargestNumberValue();
        int largestNumberIndex = computerScienceTest.getLargestNumberIndex();
        System.out.println("The highest value in the test gradings is " + largestNumberValue + ".");
        System.out.println("It's located at index " + largestNumberIndex + ",");
        System.out.println("or the " + largestNumberIndex+1 + ". position!");
    }

    private static void spacer() {
        for (int i = 0; i < 3; i++) { System.out.println(); }
    }

    public static void main(String[] args) {
        testRun();
        spacer();
        SchoolClass informatikDullies = testClass();
        spacer();
        testClassTest(informatikDullies);
    }
}
