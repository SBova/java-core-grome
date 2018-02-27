package lesson13;

import lesson10.HW.Customer;
import lesson10.HW.ElectronicsOrder;
import lesson10.HW.FurnitureOrder;
import lesson11.Hw.*;
import lesson6.Order;
import lesson7.DemoHomeWork;
import lesson8.Arithmetic.Adder;

import java.util.Arrays;
import java.util.Date;

import static lesson4.MethodExample.increaser;
import static lesson4.MethodExample.min;
import static lesson4.PracticeExample.average;
import static lesson4.PracticeExample.count;
import static lesson4.PracticeExample.min;
import static lesson4.hw.compareSumm.compareSums;
import static lesson4.hw.compareSumm.sum;
import static lesson4.hw.concat.concat;
import static lesson4.hw.count.findDivCount;
import static lesson5.BanksPractice.findClientIndexByName;
import static lesson5.BanksPractice.withdraw;
import static lesson5.arraySort.sortAscending;
import static lesson5.arraySort.sortDescending;
import static lesson5.unique.uniqueCount;

public class Test {

    public static void main(String[] args) {
        System.out.println("lesson4");
        //test class concat
        System.out.println(concat("51", "5.75", "1"));
        System.out.println(concat(null, "vova", "vova"));
        System.out.println(concat(null, "vova", null));

        System.out.println();
        //test class count
        System.out.println(findDivCount(Short.MAX_VALUE, Short.MIN_VALUE, 0));
        System.out.println(findDivCount((short) 0, (short) 1, 5));
        System.out.println(findDivCount((short) 20, (short) 7, Integer.MAX_VALUE));

        System.out.println();
        //test class compareSumm
        System.out.println(sum(0, Integer.MAX_VALUE));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MIN_VALUE));
        System.out.println(sum(Integer.MIN_VALUE, Integer.MAX_VALUE));

        System.out.println(compareSums(0, Integer.MAX_VALUE, 15, Integer.MAX_VALUE));
        System.out.println(compareSums(Integer.MAX_VALUE, Integer.MIN_VALUE, 0, Integer.MAX_VALUE));
        System.out.println(compareSums(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));

        System.out.println();

        System.out.println(increaser(0, Integer.MAX_VALUE));
        System.out.println(increaser(Integer.MAX_VALUE, Integer.MIN_VALUE));
        System.out.println(increaser(Integer.MIN_VALUE, Integer.MAX_VALUE));

        System.out.println(min(0, Integer.MAX_VALUE));
        System.out.println(min(Integer.MAX_VALUE, Integer.MIN_VALUE));
        System.out.println(min(Integer.MIN_VALUE, Integer.MAX_VALUE));

        System.out.println();

        System.out.println(min(0, Integer.MAX_VALUE, Integer.MIN_VALUE));
        System.out.println(min(Integer.MAX_VALUE, Integer.MIN_VALUE, 10));
        System.out.println(min(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE));

        System.out.println(average(70));
        System.out.println(average(0));
        System.out.println(average(-5));

        System.out.println(average(50, 65));
        System.out.println(average(0, 200));
        System.out.println(average(-15, 400));

        System.out.println(count(50, 65, 45));
        System.out.println(count(0, 200, 400));
        System.out.println(count(-15, 400, Integer.MIN_VALUE));

        System.out.println("lesson5");
        // подсчет уникальных
        System.out.println(uniqueCount(new int[]{1, 12, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        System.out.println(uniqueCount(new int[]{1, 12, 1, 5, 1, 4, 1, 77, 1, 1070, 1, Integer.MIN_VALUE}));
        System.out.println(uniqueCount(new int[]{1, 12, 1, 5, 1, 4, 1, 77, 1, 1070, 1, 999999, 55555, Integer.MIN_VALUE}));

        System.out.println();
        // тест сортировки по убыванию
        System.out.println(Arrays.toString(sortDescending((new int[]{1, 12, 1, 5, 1, 4, 1, 77, 1, 1070, 1}))));
        System.out.println(Arrays.toString(sortDescending(new int[]{1, 12, 1, 5, 1, 4, 1, 77, 1, 1070, 1, Integer.MAX_VALUE})));
        System.out.println(Arrays.toString(sortDescending(new int[]{1, 12, 1, 5, 1, 4, 1, 77, 1, 1070, 1, 999999, 55555, Integer.MIN_VALUE})));
        // тест сортировки по возрастанию
        System.out.println(Arrays.toString(sortAscending((new int[]{1, 12, 1, 5, 1, 4, 1, 77, 1, 1070, 1}))));
        System.out.println(Arrays.toString(sortAscending(new int[]{1, 12, 1, 5, 1, 4, 1, 77, 1, 1070, 1, Integer.MAX_VALUE})));
        System.out.println(Arrays.toString(sortAscending(new int[]{1, 12, 1, 5, 1, 4, 1, 77, 1, 1070, 1, 999999, 55555, Integer.MIN_VALUE})));

        System.out.println();

        System.out.println(withdraw(new String[]{"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"}, new int[]{100, 500, 8432, -99, 12000, -54, 0}, "Ann", Integer.MAX_VALUE));
        System.out.println(withdraw(new String[]{"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"}, new int[]{100, 500, 8432, -99, 12000, -54, 0}, "Irina", Integer.MAX_VALUE));
        System.out.println(withdraw(new String[]{"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"}, new int[]{100, 500, 8432, -99, 12000, -54, 0}, "John", Integer.MIN_VALUE));

        System.out.println(findClientIndexByName(new String[]{"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"}, "Vadim"));
        System.out.println(findClientIndexByName(new String[]{"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"}, "Philip"));
        System.out.println(findClientIndexByName(new String[]{"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"}, "Jack"));

        System.out.println();
        System.out.println("lesson6");

        Order order = new Order(455, new Date(), false, null, "Slovyansk", "Ukraine", "Sold");
        order.confirmOrder();
        System.out.println(order.toString());

        order = new Order(Integer.MAX_VALUE, null, false, null, "Slovyansk", "Ukraine", "Sold");
        order.confirmOrder();
        System.out.println(order.toString());

        order = new Order(Integer.MAX_VALUE, new Date(), false, new Date(), "Slovyansk", "Ukraine", "Sold");
        order.confirmOrder();
        System.out.println(order.toString());

        System.out.println();
        System.out.println("lesson7");

        DemoHomeWork demoHomeWork = new DemoHomeWork();
        System.out.println(demoHomeWork.createOrder().toString());
        System.out.println(demoHomeWork.createOrderAndCallMethods().toString());

        System.out.println();
        System.out.println("lesson8");

        System.out.println(Adder.add(Integer.MAX_VALUE, 1));
        System.out.println(Adder.add(Integer.MAX_VALUE, Integer.MIN_VALUE));
        System.out.println(Adder.add(Integer.MAX_VALUE, Integer.MAX_VALUE));

        System.out.println();
        System.out.println(Adder.check(new int[]{-10, 0, 11, 555, 60, 10}));
        System.out.println(Adder.check(new int[]{Integer.MIN_VALUE, 0, 0, 0, 0, 0, 11, Integer.MAX_VALUE}));
        System.out.println(Adder.check(new int[]{Integer.MAX_VALUE, 12, 10, 5, 4, 44, 94, 44, Integer.MAX_VALUE, 10, 11}));

        System.out.println();


        System.out.println("lesson9");

        UserRepository userRepository = new UserRepository();

        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        User user = new User((long) 1001, "Ann", "1w21212");
        userRepository.save(user);

        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        userRepository.save(user);

        System.out.println(Arrays.deepToString(userRepository.getUsers()));
        //сохранение юзера
        //сохранение того же юзера
        //когда нет места в массиве
        //когда сохраняем null

        int n = 15;
        while (n > 0) {
            User user1 = new User((long) n, "Ann", "1w21212");
            System.out.println(userRepository.save(user1));
            n--;
        }

        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        userRepository.save(null);

        //test update
        user = new User((long) 1001, "Ann", "eretertert");
        userRepository.update(user);

        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        //обновление юзера
        //когда нет юзера на обновление
        //когда обновляем null

        user = new User((long) 9999, "Ann", "eretertert");
        System.out.println(userRepository.update(user));
        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        System.out.println(userRepository.update(null));
        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        System.out.println();

        System.out.println("lesson10");

        ElectronicsOrder electronicsOrder1 = new ElectronicsOrder("Goods1", new Date(), "Днепр", 600, new Customer("Tamara", "Днепр", "Женский"), 12);
        ElectronicsOrder electronicsOrder2 = new ElectronicsOrder("Goods2", new Date(), "Одесса", 1600, new Customer("Вова", "Одесса", "Мужской"), 12);

        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Goods1", new Date(), "Днепр", 600, new Customer("Tamara", "Днепр", "Женский"), "12");
        FurnitureOrder furnitureOrder2 = new FurnitureOrder("Goods2", new Date(), "Львов", 400, new Customer("Вова", "Львов", "Мужской"), "12");

        electronicsOrder1.validateOrder();
        System.out.println(electronicsOrder1);
        electronicsOrder1.calculatePrice();
        System.out.println(electronicsOrder1);
        electronicsOrder1.confirmShipping();
        System.out.println(electronicsOrder1);

        electronicsOrder2.validateOrder();
        System.out.println(electronicsOrder2);
        electronicsOrder2.calculatePrice();
        System.out.println(electronicsOrder2);
        electronicsOrder2.confirmShipping();
        System.out.println(electronicsOrder2);

        furnitureOrder1.validateOrder();
        System.out.println(furnitureOrder1);
        furnitureOrder1.calculatePrice();
        System.out.println(furnitureOrder1);
        furnitureOrder1.confirmShipping();
        System.out.println(furnitureOrder1);

        furnitureOrder2.validateOrder();
        System.out.println(furnitureOrder1);
        furnitureOrder2.calculatePrice();
        System.out.println(furnitureOrder1);
        furnitureOrder2.confirmShipping();
        System.out.println(furnitureOrder1);

        System.out.println();
        System.out.println("lesson11");

        Room room0 = new Room(100, 100, 5, null, "Украина", "Славянск");
        Room room1 = new Room(101, 50, 4, null, "Украина", "Славянск");
        Room room2 = new Room(102, 25, 3, null, "Украина", "Славянск");
        Room room3 = new Room(103, 10, 2, null, "Украина", "Славянск");

        Room room4 = new Room(104, 100, 5, null, "Украина", "Славянск");
        Room room5 = new Room(105, 75, 4, null, "Украина", "Славянск");
        Room room6 = new Room(106, 25, 3, null, "Украина", "Славянск");
        Room room7 = new Room(107, 15, 2, null, "Украина", "Славянск");

        Room room8 = new Room(108, 1000, 5, null, "Украина", "Славянск");
        Room room9 = new Room(109, 705, 4, null, "Украина", "Славянск");
        Room room10 = new Room(110, 205, 3, null, "Украина", "Славянск");
        Room room11 = new Room(111, 150, 2, null, "Украина", "Славянск");

        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(new Room[]{null, null, null, null});
        BookingComAPI bookingComAPI = new BookingComAPI(new Room[]{null, null, null, null});
        GoogleAPI googleAPI = new GoogleAPI(new Room[]{null, null, null, null});
        Controller controller = new Controller(new API[]{tripAdvisorAPI, bookingComAPI, googleAPI});

        System.out.println(Arrays.deepToString(controller.requestRooms(100, 4, "Odessa", "Paradise")));

        controller = new Controller(new API[]{null, null, null});

        System.out.println(Arrays.deepToString(controller.requestRooms(100, 4, "Odessa", "Paradise")));

        tripAdvisorAPI = new TripAdvisorAPI(new Room[]{room0, room1, room2, room3});
        bookingComAPI = new BookingComAPI(new Room[]{room4, room5, room6, room7});
        googleAPI = new GoogleAPI(new Room[]{room8, room9, room10, room11});
        controller = new Controller(new API[]{tripAdvisorAPI, bookingComAPI, googleAPI});

        System.out.println(Arrays.deepToString(controller.requestRooms(100, 4, "Odessa", "Paradise")));
        System.out.println();
        System.out.println();
        System.out.println(Arrays.deepToString(controller.check(tripAdvisorAPI, bookingComAPI)));
        System.out.println(Arrays.deepToString(controller.check(null, bookingComAPI)));
        System.out.println(Arrays.deepToString(controller.check(tripAdvisorAPI, null)));
        System.out.println(Arrays.deepToString(controller.check(null, null)));
    }
}