import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);

        Integer offset = null;
        while (offset == null) {
            System.out.println("Please enter your Caesar offset:");
            String offsetInput = consoleScanner.nextLine();
            try {
                offset = Integer.parseInt(offsetInput);
            } catch (NumberFormatException ignored) {}
        }

        String mode = null;
        while (mode == null) {
            System.out.println("Please enter an operation mode:");
            System.out.println("- Encode");
            System.out.println("- Decode");
            String modeInput = consoleScanner.nextLine();
            String lowerModeInput = modeInput.toLowerCase();

            if (lowerModeInput.equals("encode")) { mode = "encode"; }
            else if (lowerModeInput.equals("decode")) { mode = "decode"; }
        }

        System.out.println("What do you want to " + mode + "?");
        String cypherString = consoleScanner.nextLine();

        cypherString = sanitize(cypherString);
        
        String output;
        if (mode.equals("encode")) { output = encode(cypherString, offset); }
        else { output = encode(cypherString, (offset * -1)); } // Only "encode" and "decode" can get here
        System.out.println(output);
    }

    public static String sanitize(String what) {
        what = what.toUpperCase();

        what = what.replace("Ä", "AE");
        what = what.replace("Ö", "OE");
        what = what.replace("Ü", "UE");
        what = what.replace("ß", "SS");

        return what;
    }

    public static String encode(String what, int offset) {
        char[] whatChars = what.toCharArray();

        StringBuilder encodedStringBuilder = new StringBuilder();
        for (char _char : whatChars) {
            encodedStringBuilder.append((char) (_char + offset));
        }

        return encodedStringBuilder.toString();
    }
}
