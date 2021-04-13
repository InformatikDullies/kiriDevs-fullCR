/**
 * Describes a calculator do calculate the value of one currency in another. One-way.
 *
 * @author kiriDevs
 * @version 1.0.0
 */
@SuppressWarnings("unused") // Will be used by BlueJ
public class CurrencyCalculator {
    /** The currency to be converted from */
    private final Currency nativeCurrency;
    /** The currency to be converted to */
    private final Currency newCurrency;

    /**
     * Constructor - accepts two currencies
     *
     * @param nativeCurrency The currency to convert from
     * @param newCurrency The currency to convert to
     */
    @SuppressWarnings("unused") // Will be used by BlueJ
    public CurrencyCalculator(Currency nativeCurrency, Currency newCurrency) {
        this.nativeCurrency = nativeCurrency;
        this.newCurrency = newCurrency;
    }

    /**
     * Constructor - accepts two stringIDs of currencies
     *
     * @param nativeCurrencyId The StringID of the currency to convert from
     * @param newCurrencyId The StringID of the currency to convert to
     */
    @SuppressWarnings("unused") // Will be used by BlueJ
    public CurrencyCalculator(String nativeCurrencyId, String newCurrencyId) {
        this.nativeCurrency = CurrencyManager.getCurrency(nativeCurrencyId);
        if (this.nativeCurrency == null) {
            throw new IllegalArgumentException("No Currency with the ID "
                                              + nativeCurrencyId +
                                              " was found!");
        }

        this.newCurrency = CurrencyManager.getCurrency(newCurrencyId);
        if (this.newCurrency == null) {
            throw new IllegalArgumentException("No Currency with the ID "
                                              + newCurrencyId + " was found!");
        }
    }

    /**
     * @param amount The amount of currency to be converted
     */
    @SuppressWarnings("unused") // Will be used by BlueJ
    public void calc(float amount) {
        float roundAmount = (Math.round(amount * 100) / 100f);
        if (amount != roundAmount) {
            throw new IllegalArgumentException("The input float can only have" +
                                               " up to 2 decimal places!");
        }

        float newAmount = nativeCurrency.convert(newCurrency, amount);

        float roundNewAmount = Math.round(newAmount * 100) / 100f;

        String message = "";
        message += roundAmount;
        message += nativeCurrency.stringId;
        message += " ergibt ungefähr ";
        message += roundNewAmount;
        message += newCurrency.stringId;
        message += "!";
        System.out.println(message);
    }

}
