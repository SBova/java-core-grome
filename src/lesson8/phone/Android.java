package lesson8.phone;

public class Android extends Phone {
    // int price;
    //double weight;
    //String countriProduced;
//
    String androidVersion;
    int screenSize;

    String secretDeviceCode;

    public Android(int price, double weight, String countriProduced, String androidVersion, int screenSize, String secretDeviceCode) {
        // this.price = price;
        //this.weight = weight;
        //this.countriProduced = countriProduced;
        super(price, weight, countriProduced);

        //this - reference to the current class object
        //this - ссылка на объект текущего класса;
        //super- reference to the parent class object
        //super- ссылка на объект родительского класса

        this.androidVersion = androidVersion;
        this.screenSize = screenSize;
        this.secretDeviceCode = secretDeviceCode;
    }

    // void orderPhone(){
    //some logic
    //}
    void InstallNewAndroidVersion() {
        System.out.println("InstallNewAndroidVersion invoked...");
    }
}
