package lesson8.phone;

public class IPhone extends Phone {
    //   int price;
    // double weight;
    //String countriProduced;

    boolean fingerPrint;

    public IPhone(int price, double weight, String countriProduced, boolean fingerPrint) {

        super(price, weight, countriProduced);

        System.out.println("IPhone constructor was invoked...");
        this.fingerPrint = fingerPrint;
    }

    // void orderPhone(){
    //some logic
    //}
    void deleteIPhoneFromDb() {
        System.out.println("deleteIPhoneFromDb invoked...");
    }


}
