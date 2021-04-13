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
    
}
