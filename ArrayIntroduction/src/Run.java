/**
 * The Run class defines a run with multiple participants,
 * saving placements and times of the runners
 */
public class Run {
    @SuppressWarnings("FieldMayBeFinal")
    private double[] times;

    /**
     * The constructor for the Run class.
     * Defines a run with multiple participants,
     * based on the given number of participants.
     *
     * @param numberOfRunners The number of runners participating in the run
     */
    public Run(int numberOfRunners) {
        this.times = new double[numberOfRunners];
    }

    /**
     * Sets the time for a specific placement in the run.
     *
     * @param time      The time of the runner
     * @param placement The placement of the runner (1-based)
     */
    public void setTime(double time, int placement) {
        int index = placement - 1; // Placements are 1-based, indices are 0-based
        this.times[index] = time;
    }

    /**
     * Gets the time for a specific placement
     *
     * @param placement The placement of the queried time (1-based)
     * @return The queried time for the given placement
     */
    public double getTime(int placement) {
        int index = placement - 1; // Placements are 1-based, indices are 0-base
        return this.times[index];
    }

    /**
     * Prints all times of all runners into the console.
     * All times have to be filled first.
     *
     * @return true on success, false if not all times have been filled yet.
     */
    public boolean printAllTimes() {
        // Checking if all times have been filled and don't allow printing before that
        for (double time : this.times) {
            if (time == 0d) { return false; }
        }

        // Printing the times for placements
        int placement = 1;
        for (double time : this.times) {
            System.out.println(placement + ".: " + time);
            placement++;
        }
        return true;
    }

}
