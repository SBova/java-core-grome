package lesson15.equals.HWAPI;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Room room1 = new Room(1, 100, 1, null, "Украина", "Славянск");
        Room room2 = new Room(2, 600, 2, new Date(), "Украина", "Славянск");
        Room room3 = new Room(3, 500, 1, new Date(), "Украина", "Славянск");
        Room room4 = new Room(4, 800, 4, new Date(), "Украина", "Славянск");
        Room room5 = new Room(5, 90, 3, new Date(), "Украина", "Славянск");

        Room room6 = new Room(6, 100, 1, new Date(), "Украина", "Славянск");
        Room room7 = new Room(7, 100, 2, new Date(), "Украина", "Славянск");
        Room room8 = new Room(8, 500, 1, new Date(), "Украина", "Славянск");
        Room room9 = new Room(9, 400, 4, new Date(), "Украина", "Славянск");
        Room room10 = new Room(10, 909, 3, null
                , "Украина", "Славянск");

        Room room11 = new Room(11, 900, 3, new Date(), "Украина", "Славянск");
        Room room12 = new Room(12, 1000, 2, new Date(), "Украина", "Славянск");
        Room room13 = new Room(13, 5000, 1, new Date(), "Украина", "Славянск");
        Room room14 = new Room(14, 4000, 4, new Date(), "Украина", "Славянск");
        Room room15 = new Room(15, 909, 3, new Date(), "Украина", "Славянск");


        Room[] rooms = {room1, room2, room3, room4, room5};
        Room[] rooms2 = {room6, room7, room8, room9, room10};
        Room[] rooms3 = {room11, room12, room13, room14, room15};
        GoogleAPI googleAPI = new GoogleAPI(rooms);
        BookingComAPI bookingComAPI = new BookingComAPI(rooms2);
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(rooms3);
        API[] array = {googleAPI, bookingComAPI, tripAdvisorAPI};


        Controller controller = new Controller(array);
        Room[] checkRoom = controller.check(bookingComAPI, googleAPI);
        //valid id 6,8
        System.out.println(Arrays.toString(checkRoom));
        System.out.println("");
        checkRoom = controller.check(bookingComAPI, tripAdvisorAPI);
        //valid id 10
        System.out.println(Arrays.toString(checkRoom));
        System.out.println("");
        checkRoom = controller.check(tripAdvisorAPI, googleAPI);
        //нет общих возврат null
        System.out.println(Arrays.toString(checkRoom));

        System.out.println("Test BookingComAPI");

        bookingComAPI = new BookingComAPI(rooms);
        Room[] check = bookingComAPI.findRooms(100,1,"Славянск", "Украина");
        //id 1 and 2 valid
        System.out.println(Arrays.toString(check));
        check = bookingComAPI.findRooms(100,1,"Test", "Украина");
        //wrong city
        System.out.println(Arrays.toString(check));
        check = bookingComAPI.findRooms(100,1,"Славянск", "4");
        //wrong hotel
        System.out.println(Arrays.toString(check));

        System.out.println("Test GoogleAPI");

        googleAPI = new GoogleAPI(rooms);
        check = googleAPI.findRooms(100, 1, "Славянск", "Украина");
        //id 1 valid
        System.out.println(Arrays.toString(check));
        check = googleAPI.findRooms(100, 1, "Test", "Украина");
        //wrong city
        System.out.println(Arrays.toString(check));
        check = googleAPI.findRooms(100, 1, "Славянск", "4");
        //wrong hotel
        System.out.println(Arrays.toString(check));

        System.out.println("Test TripAdvisorAPI");

        tripAdvisorAPI = new TripAdvisorAPI(rooms);
        check = tripAdvisorAPI.findRooms(100, 2, "Славянск", "Украина");
        //id 2,4,5 valid
        System.out.println(Arrays.toString(check));
        check = tripAdvisorAPI.findRooms(100, 2, "Test", "Украина");
        //wrong city
        System.out.println(Arrays.toString(check));
        check = tripAdvisorAPI.findRooms(100, 2, "Славянск", "4");
        //wrong hotel
        System.out.println(Arrays.toString(check));

        System.out.println("Test Controller");

        googleAPI = new GoogleAPI(rooms);
        bookingComAPI = new BookingComAPI(rooms);
        tripAdvisorAPI = new TripAdvisorAPI(rooms);
        array = new API[]{googleAPI, bookingComAPI, tripAdvisorAPI};


        controller = new Controller(array);
        Room[] checkRequestRoom = controller.requestRooms(100, 2, "Славянск", "Украина");
        //booking- valid id 1,2
        //trip valid id 1,2,5
        //google valid id 2
        //total 6 rooms
        System.out.println(Arrays.toString(checkRequestRoom));
        System.out.println(checkRequestRoom.length);

    }
}