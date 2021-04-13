import java.util.Random;
import java.util.Scanner;

/**
 * Creates a Tasks obkect which executes one specific task on creation.
 * The task that is run will be determined by a String asked for by a Scanner on Console.in.
 * 
 * @author kiriDevs
 * @version 1.0 
 */
public class Tasks {
    /** The Scanner that reads the user input, both for the game selection aswell as game input */
    Scanner consoleScanner;
    /** The Die to be used to play the selected "boardgame" */
    Die die = new Die();
    
    /**
     * Constructor of the Tasks class - asks for a console input to pick a game to be run,
     * runs the game from the given worksheet task number afterwards.
     */
    public Tasks() {
        consoleScanner = new Scanner(System.in);
        
        System.out.println("Which task code do you want to run?");
        String runTaskString = consoleScanner.nextLine();
        
        int curNum;
        switch(runTaskString) {
            case "1while":
                curNum = 10;
                while (curNum >= 0) {
                    System.out.println(curNum);
                    curNum--;
                }
                break;
                
            case "1for":
                for (curNum = 10; curNum >= 0; curNum--) {
                    System.out.println(curNum);
                }
                break;
            
            case "2":
                int sixes = 0;
                for (int i = 0; i < 100; i++) {
                    die.roll();
                    curNum = die.getNumber();
                    System.out.println((i + 1) + ".: " + curNum);
                    if (curNum == 6) { sixes++; }
                }
                System.out.println("Es wurden " + sixes + " Sechsen gew�rfelt!");
                break;
               
            case "3":
                do {
                    System.out.println("Bitten geben Sie eine positive Ganzzahl ein: (0 oder niedriger beendet die Eingabe)");
                    curNum = consoleScanner.nextInt();
                } while (curNum > 0);
                System.out.println(curNum + " <= 0 - Zahleneingabe beendet!");
                break;
                
            case "3a":
                Integer max3a = null;
                Integer min3a = null;
                int numCount3a = 0;
                do {
                    System.out.println("Bitte geben Sie eine positive Ganzzahl ein: (0 oder niedriger beendet die Eingabe)");
                    curNum = consoleScanner.nextInt();
                    
                    if (max3a == null) { max3a = curNum; }
                    if (min3a == null) { min3a = curNum; }
                    
                    if (curNum == 0) { continue; }
                    
                    if (curNum > max3a) { max3a = curNum; }
                    if (curNum < min3a) { min3a = curNum; }
                    numCount3a++;
                } while (curNum > 0);
                System.out.println();
                System.out.println("Sie haben " + numCount3a + " Zahlen eingegeben!");
                System.out.println("Die h�chste Zahl war " + max3a + "!");
                System.out.println("Die niedrigste Zahl war " + min3a + "!");
                System.out.println();
                break;

            case "3b":
                Integer max3b = null;
                Integer min3b = null;
                int numCount3b = 0;
                do {
                    System.out.println((numCount3b + 1) + ". Zahl: ");
                    curNum = consoleScanner.nextInt();

                    if (max3b == null) { max3b = curNum; }
                    if (min3b == null) { min3b = curNum; }

                    if (curNum == 0) { continue; } // This will end the loop, as (curNum > 0) will be false; therefore skipping commands below

                    if (curNum > max3b) { max3b = curNum; }
                    if (curNum < min3b) { min3b = curNum; }
                    numCount3b++;
                } while (curNum > 0);
                System.out.println();
                System.out.println("Sie haben " + numCount3b + " Zahlen eingegeben!");
                System.out.println("Die h�chste Zahl war " + max3b + "!");
                System.out.println("Die niedrigste Zahl war " + min3b + "!");
                System.out.println();
                break;

            case "3cd":
                Integer max3cd = null;
                Integer max3cdIndex = null;
                Integer min3cd = null;
                Integer min3cdIndex = null;
                int numCount3cd = 0;
                do {
                    System.out.println((numCount3cd + 1) + ". Zahl: ");
                    curNum = consoleScanner.nextInt();

                    if (max3cd == null) { max3cd = curNum; max3cdIndex = curNum; }
                    if (min3cd == null) { min3cd = curNum; min3cdIndex = curNum; }

                    if (curNum == 0) { continue; }

                    if (curNum > max3cd) { max3cd = curNum; max3cdIndex = numCount3cd; }
                    if (curNum < min3cd) { min3cd = curNum; min3cdIndex = numCount3cd; }
                    numCount3cd++;
                } while (curNum > 0);
                System.out.println();
                System.out.println("Sie haben " + numCount3cd + " Zahlen eingegeben!");
                System.out.println("Die h�chste Zahl war die " + (max3cdIndex+1) + ". Zahl (" + max3cd + ")!");
                System.out.println("Die niedrigste Zahl war die " + (min3cdIndex+1) + ". Zahl (" + min3cd + ")!");
                System.out.println();
                break;

            case "4a":
                int target4a = new Random().nextInt(1001);
                do {
                    System.out.println("Bitte raten Sie eine Zahl:");
                    curNum = consoleScanner.nextInt();

                    if (curNum > target4a) { System.out.println("Diese Zahl ist zu hoch - Die gesuchte Zahl ist niedriger!"); }
                    if (curNum < target4a) { System.out.println("Diese Zahl ist zu niedrig - Die gesuchte Zahl ist h�her!"); }
                } while (curNum != target4a);
                System.out.println("Dies ist richtig! Herzlichen Gl�ckwunsch!");
                break;

            case "4b":
                int MAX_NUM = 1000;
                int MIN_NUM = 1;

                Integer target4b = null;
                do {
                    System.out.println("Spieler 2 - Bitte geben Sie eine Zahl von 1 bis 1000 ein!");
                    int input = consoleScanner.nextInt();
                    if (input >= MIN_NUM && input <= MAX_NUM) { target4b = input; }
                    else { System.out.println("Ung�ltige Eingabe! Die Zahl muss zwischen 1 und 1000 (inklusiv) liegen!"); }
                } while (target4b == null);

                Integer tries4b = null;
                do {
                    System.out.println("Spieler 2 - Bitte geben Sie die erlaubte Anzahl an Versuchen ein! (mindestens 11)");
                    int num = consoleScanner.nextInt();

                    if (num >= 11) { // At least eleven tries are required to make the game always possible through binary space division for player1
                        tries4b = num;
                        continue; // Skips the error message; stops looping as tries4b is no longer null
                    }

                    System.out.println("Ung�ltige Eingabe! Es m�ssen mindestens 11 Versuche gew�hrt werden!");
                } while(tries4b == null);

                for (int i = 0; i < 100; i++) {
                    System.out.println();
                }

                int triesLeft4b = tries4b;
                do {
                    System.out.println("Spieler 1 - Bitte raten Sie eine Zahl (�brige Versuche: " + triesLeft4b + "):");
                    curNum = consoleScanner.nextInt();

                    if (curNum > target4b) { System.out.println("Diese Zahl ist zu hoch - Die gesuchte Zahl ist niedriger!"); triesLeft4b--; }
                    if (curNum < target4b) { System.out.println("Diese Zahl ist zu niedrig - Die gesuchte Zahl ist h�her!"); triesLeft4b--; }
                } while ((curNum != target4b) && (triesLeft4b > 0));
                if (curNum == target4b) { System.out.println("Dies ist richtig! Herzlichen Gl�ckwunsch!"); }
                else { System.out.println("Sie haben die richtige Zahl in " + tries4b + " Versuchen nicht erraten k�nnen. Sie haben verloren."); }
                break;
        }
    }
}