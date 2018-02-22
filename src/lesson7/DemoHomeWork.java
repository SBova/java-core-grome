package lesson7;

import lesson6.Order;

import java.util.Date;

public class DemoHomeWork {
    public static void main(String[] args) {
        DemoHomeWork orderObject = new DemoHomeWork();
        orderObject.createOrder();
        orderObject.createOrderAndCallMethods();
    }

    public Order createOrder() {
        Order orderObject = new Order(100, new Date(), false, null, "Dnepr", "Ukraine", "Buy");
        return orderObject;
    }

    public Order createOrderAndCallMethods() {
        Order orderObject = new Order(100, new Date(), true, new Date(), "Kiev", "Ukraine", "SomeValue");
        orderObject.confirmOrder();
        orderObject.checkPrice();
        orderObject.isValidType();
        return orderObject;
    }
}
