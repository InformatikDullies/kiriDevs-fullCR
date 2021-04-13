/**
 * @author kiriDevs
 * @version 1.0
 */

import java.util.Random;

public class Die {
    final Random randomGen = new Random();
    int shows;
    
    public Die() {}
    
    public int roll(){
        blindRoll();
        return shows;
    }
    
    public void blindRoll() {
        int randomNum = randomGen.nextInt(6);
        int dieNum = randomNum+ 1;
        
        shows = dieNum;
    }
    
    public int getNumber() { return shows; }
}
