/**
 * A currency that can be converted to another currency.
 *
 * @author kiriDevs
 * @version 1.0.0
 */
public class Currency {
    public final String stringId;
    public final float dollarValue;

    /**
     * Constructor of the Currency-Class - creates a new Currency object
     *
     * @param strId The stringId to assign to the new Currency
     *              in the CurrencyManager
     * @param dollarValue The value of the currency in dollars
     */
    public Currency(String strId, float dollarValue) {
        this.stringId = strId;
        this.dollarValue = dollarValue;

        CurrencyManager.registerCurrency(this); // Registering myself
    }


    /**
     * Get the value of this Currency against USD ($)
     *
     * @return The value of this currency in USD ($)
     */
    public float getValue() {
        return dollarValue;
    }

    /**
     * Convert a specific amount of currency-units of this Currency
     * to it's specific value in anotehr Currency
     *
     * @param to The currency to convert this Currency to
     * @param amount The amount of currency-units of this Currency to convert
     * @return The value of amount x (this currency) in the currency
     *         passed as the to parameter
     */
    public Float convert(Currency to, float amount) {
        // Converting this to dollars
        float dollars = amount * dollarValue;

        // Converting dollars to other currency and returning the result
        float otherValue = to.getValue();
        return dollars / otherValue;
    }

    /**
     * Convert into another currency without having the Currency Object,
     * using the other currencies stringID
     *
     * @param toStringId The stringID of the currency to convert to
     * @param amount The amount of units from this currency to convert
     * @return The valud of amount x (this currency) in the other currency
     *         specified by stringID in toStringId
     */
    public Float convert(String toStringId, float amount) {
        // Getting other currency Object
        Currency convertTo = CurrencyManager.getCurrency(toStringId);
        if (convertTo == null) {
            throw new IllegalArgumentException("The currency " + toStringId +
                                               " does not exist!");
        }

        // Converting this to dollars
        float dollars = amount * dollarValue;

        // Converting dollars to other currency and returning the result
        float otherValue = convertTo.getValue();
        return dollars / otherValue;
    }
}
