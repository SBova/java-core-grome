package lesson8.phone;

public class Phone {
    int price;
    double weight;
    String countriProduced;

    public Phone(int price, double weight, String countriProduced) {
        System.out.println("Phone constructor was invoked...");
        this.price = price;
        this.weight = weight;
        this.countriProduced = countriProduced;
    }

    void orderPhone() {
        System.out.println("order phone invoked...");
    }
}
