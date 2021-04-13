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
}
