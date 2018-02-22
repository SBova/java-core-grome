package lesson11.Hw;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {

        //нахождение комнаты +
        //отсутствие комнати в параметрах+
        //показать все+


        Room room0 = new Room(111, 250, 1, new Date(), "Украина", "Славянск");
        Room room1 = new Room(112, 350, 2, new Date(), "Украина", "Славянск");
        Room room2 = new Room(203, 450, 1, new Date(), "Украина", "Краматорск");
        Room room3 = new Room(404, 150, 2, new Date(), "Украина", "Краматорск");
        Room[] rooms = new Room[]{room0, room1, room2, room3};

        BookingComAPI bookingComAPI = new BookingComAPI(rooms);
        System.out.println(Arrays.toString(bookingComAPI.findRooms(250,2,"Славянск", "Украина")));
        System.out.println(Arrays.toString(bookingComAPI.findRooms(450,1,"Краматорск", "Украина")));
        System.out.println(Arrays.toString(bookingComAPI.getAll()));

        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(rooms);
        System.out.println(Arrays.toString(tripAdvisorAPI.findRooms(350,2,"Славянск","Украина")));
        System.out.println(Arrays.toString(tripAdvisorAPI.findRooms(450,1,"Краматорск","Украина")));
        System.out.println(Arrays.toString(tripAdvisorAPI.getAll()));

        GoogleAPI googleAPI = new GoogleAPI(rooms);
        System.out.println(Arrays.toString(googleAPI.findRooms(500,5,"Славянск","Украина")));
        System.out.println(Arrays.toString(googleAPI.findRooms(450,1,"Краматорск","Украина")));
        System.out.println(Arrays.toString(googleAPI.getAll()));

        API[]apis = new API[]{bookingComAPI,tripAdvisorAPI,googleAPI};
        bookingComAPI.findRooms(450,1,"Славянск", "Украина");
        tripAdvisorAPI.findRooms(450,1,"Краматорск","Украина");
        googleAPI.findRooms(450,1,"Славянск","Украина");

        Controller controller = new Controller(apis);



    }

}