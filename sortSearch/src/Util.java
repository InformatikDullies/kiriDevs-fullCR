import java.lang.StringBuilder;

public class Util {
    public static void printSearchResult(int number, Integer index) {
        StringBuilder outputBuilder = new StringBuilder();

        outputBuilder.append("Die Zahl ");
        if ((number < 10) && (number >= 0)) { outputBuilder.append(" "); }
        outputBuilder.append(number);

        if (index == null) {
            outputBuilder.append(" wurde nicht gefunden.");
        } else {
            outputBuilder.append(" liegt an ");

            if (index < 9) { outputBuilder.append(" "); }
            outputBuilder.append(index + 1);
            outputBuilder.append(". Stelle. (Index: ");

            if (index < 10) { outputBuilder.append(" "); }
            outputBuilder.append(index);
            outputBuilder.append(")");
        }

        System.out.println(outputBuilder.toString());
    }
}