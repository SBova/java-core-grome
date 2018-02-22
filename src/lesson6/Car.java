package lesson6;

public class Car {
    //1.fields - поля( свойства класса)
    int price;
    int yearOfManufacturing;
    String color;
    String ownerName;
    double weight;
    int horsePower;

    //.......

    //2. constructors - конструкторы(не обязательно будет)


    public Car(int price, int yearOfManufacturing, String ownerName) {
        this.price = price;
        this.yearOfManufacturing = yearOfManufacturing;
        this.ownerName = ownerName;


    }

    //3. methods - методы
    void startRun() {
        System.out.println("I am running....");
    }

    void stopRun() {
        System.out.println("I am stopping....");
    }

    void changeOwner(String newOwnerName) {
        ownerName = newOwnerName;
    }
    //classbody

    // 4.inner class
    // private class Test {
//    }
}
