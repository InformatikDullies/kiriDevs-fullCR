import java.util.Scanner;

/**
 * Defines a "table" to play boardgames on
 *
 * @author kiriDevs
 * @version 1.0
 */
public class Boardgame {
    /** Contructor of the Boardgame class. Empty, just returns a Boardgame object. */
    public Boardgame() { }

    /**
     * Play a boardgame on the table
     *
     * @param gametype The number of the game that should be played (Number: 1-4)
     */
    @SuppressWarnings("unused") // Will be used during BlueJ runtime
    public void play(int gametype) {
        Die die = new Die();
        int one = 0;
        int two = 0;
        int number;

        System.out.println();
        System.out.println("Das Spiel beginnt!");
        System.out.println();

        int winner = 0;
        switch(gametype) {
            case 1: // Game 1
            /*
             * Every player rolls 10 times,
             * the player with the higher number
             * wins the game.
             */
            for (int i = 0; i < 10; i++) {
                int rollOne = die.roll();
                System.out.println("1 w�rfelt eine " + rollOne + " > " + one);
                one += die.roll();

                int rollTwo = die.roll();
                System.out.println("2 w�rfelt eine " + rollTwo + " > " + two);
                two += die.roll();
            }

            if (one > two) { winner = 1; }
            // if (one == two) { winner = 0; } // 0 is already defined by default
            if (one < two) { winner = 2; }
            break;

            case 2: // Game 2
            /*
             * Play until one person has 50 points
             * (Player 2 has NO revenge roll if player 1 reaches 50)
             */
            boolean onesTurn = true;
            while ((one < 50) && (two < 50)) {
                number = die.roll();
                if (onesTurn) {
                    one += number;
                    System.out.println("1 w�rfelt eine " + number + " > " + one);
                } else {
                    two += number;
                    System.out.println("2 w�rfelt eine " + number + " > " + two);
                }
                onesTurn = !onesTurn;
            }

            if (one >= 50) { winner = 1; }
            if (two >= 50) { winner = 2; }
            break;

            case 3: // Game 3
            /*
             * Prediction: Each player enters a number,
             * then a number is rolled. Winner is whoever predicts
             * the right number.
             */
            Scanner consoleScanner = new Scanner(System.in);
            
            System.out.println("Spieler 1 - Auf welche Zahl tippst du?");
            String oneString = consoleScanner.nextLine();
            one = Integer.parseInt(oneString);
            
            System.out.println("Spieler 2 - Auf welche Zahl tippst du?");
            String twoString = consoleScanner.nextLine();
            two = Integer.parseInt(oneString);
            
            number = die.roll();
            System.out.println("Es wurde gew�rfelt: " + Integer.toString(number) + "!");

            if (one == number) { winner = 1; }
            if (two == number) { winner = 2; }
            if ((one == number) && (two == number)) { winner = 0; }
            if ((one != number) && (two != number)) { winner = -1; }
            break;
            
            case 4:
            /*
             * Fox hunt: The first player gets 6 die throws,
             * afterwards player 2 tries to reach that score with 5 throws.
             */
            
            // 6 Throws for player 1
            for (int i = 0; i < 6; i++) {
                number = die.roll();
                System.out.println("1 w�rfelt eine " + number + " > " + one);
                one += number;
            }
            
            if (one > two) { winner = 1; }
            if (two > one) { winner = 2; }
            // if (one == two) { winner = 0; } // 0 is already defined by default
            break;
        }

        switch(winner) {
            case 2:
            System.out.println("Spieler zwei gewinnt!");
            break;
            
            case 1:
            System.out.println("Spieler eins gewinnt!");
            break;

            case 0:
            System.out.println("Unentschieden!");
            break;
            
            case -1:
            System.out.println("Beide verlieren - Unentschieden! (fuckin' N0085)");
            break;
        }
    }
}
