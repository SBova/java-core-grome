package lesson27.task1;

public class Order {
    private long id;
    private int price;
    private String currency;
    private String itemName;
    private String shopIdentificator;

    public Order(long id, int price, String currency, String itemName, String shopIdentificator) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (price != order.price) return false;
        if (currency != null ? !currency.equals(order.currency) : order.currency != null) return false;
        if (itemName != null ? !itemName.equals(order.itemName) : order.itemName != null) return false;
        return shopIdentificator != null ? shopIdentificator.equals(order.shopIdentificator) : order.shopIdentificator == null;
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (itemName != null ? itemName.hashCode() : 0);
        result = 31 * result + (shopIdentificator != null ? shopIdentificator.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", price=" + price +
                ", currency='" + currency + '\'' +
                ", itemName='" + itemName + '\'' +
                ", shopIdentificator='" + shopIdentificator + '\'' +
                '}';
    }
}