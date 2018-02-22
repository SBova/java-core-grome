package lesson20.task2;

public class Utils {

    private int limitTransactionsPerDayCount = 1000;
    private int limitTransactionsPerDayAmount = 2000;
    private int limitSimpleTransactionAmount = 350;
    private String[] cities = {"Kiev", "Odessa"};

    public int getLimitTransactionPerDayCount() {
        return limitTransactionsPerDayCount;
    }

    public int getLimitTransactionPerDayAmount() {
        return limitTransactionsPerDayAmount;
    }

    public int getLimitSimpleTransactionAmount() {
        return limitSimpleTransactionAmount;
    }

    public String[] getCities() {
        return cities;
    }
}