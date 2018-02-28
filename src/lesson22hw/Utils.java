package lesson22hw;

public class Utils {

    private static int limitTransactionsPerDayCount = 100;
    private static int limitTransactionsPerDayAmount = 2000;
    private static int limitSimpleTransactionAmount = 350;
    private static String[] cities = {"Kiev", "Odessa"};


    public static int getLimitTransactionPerDayCount() {
        return limitTransactionsPerDayCount;
    }

    public static int getLimitTransactionPerDayAmount() {
        return limitTransactionsPerDayAmount;
    }

    public static int getLimitSimpleTransactionAmount() {
        return limitSimpleTransactionAmount;
    }

    public static String[] getCities() {
        return cities;
    }
}