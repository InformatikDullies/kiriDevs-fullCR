import java.util.HashMap;
import java.util.Map;


/**
 * A static helper class to manage registration of multiple currencies,
 * to make sure that every stringId is only used once
 *
 * @author kiriDevs
 * @version 1.0.0
 */
public class CurrencyManager {
    /** The map to store all registered currencies in */
    public static Map<String, Currency> currencyMap = new HashMap<>();

    /**
     * Registers a currency to the manager
     *
     * @param toRegister The currency to register
     */
    public static void registerCurrency(Currency toRegister) {
        if (isTaken(toRegister.stringId)) {
            throw new IllegalArgumentException(
            "Every strId can only be used once!");
        }

        currencyMap.put(toRegister.stringId, toRegister);
    }

    /**
     * Checks if a specific stringId is already registered to the manager
     *
     * @param stringId The stringId to check
     * @return true when the stringId is already used
     *         false when the stringId is not used
     */
    public static boolean isTaken(String stringId) {
        return currencyMap.containsKey(stringId);
    }

    /**
     * Gets and returns a specific Currency via it's stringId
     *
     * @param stringId The stringId to get the Currency of
     * @return The Currency with the requested stringId,
     *         null if the stringId is not registered to the manager
     */
    public static Currency getCurrency(String stringId) {
        return currencyMap.get(stringId);
    }

    /**
     * Initializes and registers the following default currencies with
     * their corresponding ISO-codes as stringIDs
     */
    @SuppressWarnings("unused") // Will be used by BlueJ
    public static void initDefaultCurrencies() {
        Currency usDollar               = new Currency("USD", 1.000000f);

        Currency argentinePeso          = new Currency("ARS", 0.011563f);
        Currency australianDollar       = new Currency("AUD", 0.772637f);
        Currency bahrainiDinar          = new Currency("BHD", 2.659574f);
        Currency botswanaPula           = new Currency("BWP", 0.091243f);
        Currency brazilianReal          = new Currency("BRL", 0.182927f);
        Currency britishPound           = new Currency("GBP", 1.369377f);
        Currency bruneianDollar         = new Currency("BND", 0.753607f);
        Currency bulgarianLev           = new Currency("BGN", 0.621849f);
        Currency canadianDollar         = new Currency("CAD", 0.786660f);
        Currency chileanPeso            = new Currency("CLP", 0.001374f);
        Currency chineseYuanRenminbi    = new Currency("CNY", 0.154378f);
        Currency colombianPeso          = new Currency("COP", 0.000283f);
        Currency croatianKuna           = new Currency("HRK", 0.160806f);
        Currency czechKoruna            = new Currency("CZK", 0.046589f);
        Currency danishKrone            = new Currency("DKK", 0.163470f);
        Currency emiratiDirham          = new Currency("AED", 0.272294f);
        Currency euro                   = new Currency("EUR", 1.216231f);
        Currency hongKongDollar         = new Currency("HKD", 0.129013f);
        Currency hungarianForint        = new Currency("HUF", 0.003404f);
        Currency icelandicKrona         = new Currency("ISK", 0.007747f);
        Currency indianRupee            = new Currency("INR", 0.013714f);
        Currency indonesianRupiah       = new Currency("IDR", 0.000071f);
        Currency iranianRial            = new Currency("IRR", 0.000024f);
        Currency israeliShekel          = new Currency("ILS", 0.305086f);
        Currency japaneseYen            = new Currency("JPY", 0.009636f);
        Currency kazakhstaniTenge       = new Currency("KZT", 0.002376f);
        Currency kuwaitiDinar           = new Currency("KWD", 3.302603f);
        Currency libyanDinar            = new Currency("LYD", 0.224457f);
        Currency malaysianRinggit       = new Currency("MYR", 0.247302f);
        Currency mauritianRupee         = new Currency("MUR", 0.025357f);
        Currency mexicanPeso            = new Currency("MXN", 0.050113f);
        Currency nepaleseRupee          = new Currency("NPR", 0.008531f);
        Currency newZealandDollar       = new Currency("NZD", 0.720616f);
        Currency norwegianKrone         = new Currency("NOK", 0.117797f);
        Currency omaniRial              = new Currency("ORM", 2.600780f);
        Currency pakistaniRupee         = new Currency("PKR", 0.006217f);
        Currency philippinePeso         = new Currency("PHP", 0.020806f);
        Currency polishZloty            = new Currency("PLN", 0.267759f);
        Currency qatariRiyal            = new Currency("QAR", 0.274725f);
        Currency romanianNewLeu         = new Currency("RON", 0.249489f);
        Currency russianRuble           = new Currency("RUB", 0.013260f);
        Currency saudiArabianRiyal      = new Currency("SAR", 0.266667f);
        Currency singaporeDollar        = new Currency("SGD", 0.753607f);
        Currency southAfricanRand       = new Currency("ZAR", 0.065584f);
        Currency southKoreanWon         = new Currency("KRW", 0.000907f);
        Currency sriLankanRupee         = new Currency("LKR", 0.005063f);
        Currency swedishKrona           = new Currency("SEK", 0.120838f);
        Currency swissFranc             = new Currency("CHF", 1.128180f);
        Currency taiwanNewDollar        = new Currency("TWD", 0.035710f);
        Currency thaiBaht               = new Currency("THB", 0.033349f);
        Currency trinidadianDollar      = new Currency("TTD", 0.147054f);
        Currency turkishLira            = new Currency("TRY", 0.135003f);
        Currency venezuelanBolivar      = new Currency("VEF", 0.100125f);
    }
}
