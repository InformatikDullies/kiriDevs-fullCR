// Die Lite
import java.util.Random;

/**
 * A simple Die to roll and get a number from 1 to 6
 * 
 * @author kiriDevs
 * @version 1.0
 */
public class Die {
    Random randomGen;
    int faceNumber = 0;
    
    /** Constructor of the Die class - creates and sets the used Random generator. */
    public Die() {
        randomGen = new Random();
    }
    
    /** Rolls the die. Does not return the rolled number. */
    public void roll() {
        int number = randomGen.nextInt(6);
        faceNumber = number + 1;
        // return faceNumber;
    }
    
    /**
     * Getter for the number last rolled by this Die
     * 
     * @return The number last rolled by this Die
     */
    public int getNumber() {
        if (faceNumber == 0) { roll(); }
        return faceNumber;
    }
}