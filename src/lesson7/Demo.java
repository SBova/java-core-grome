package lesson7;

import lesson6.Car;
import lesson6.DbConnector;
import lesson6.User;

public class Demo {
    public static void main(String[] args) {

        //class name (type) объект какого класса
        // two options to create object
        //class name (type) object name = new class name(); без атрибутов
        //class name (type) object name = new class name(attributes); с атрибутами

        User user = new User();
        User user1 = new User();
        User user2 = new User();

        User user3 = new User("Jack");

        Car car = new Car(10000, 2015, "Anton");
        //Car car = new Car(); не создаст так как в класе нет такого конструктора

        DbConnector dbConnector = new DbConnector();//объект создастся так как если нет конструктора то пустой идет по умолчанию
    }
}
