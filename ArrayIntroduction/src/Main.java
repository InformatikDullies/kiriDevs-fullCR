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

    private static void testClass() {
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
    }

    public static void main(String[] args) {
        testRun();
        System.out.println();
        System.out.println();
        System.out.println();
        testClass();
    }
}
