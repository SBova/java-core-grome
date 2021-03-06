package lesson11.Hw;

import java.util.Arrays;

public class GoogleAPI implements API {
    private Room[] rooms;
    private Room[] findedRooms;
    private int count;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        count = 0;
        for (Room el : rooms)
            if (el != null)
                //if (el.dateAvailableFrom!=null&&el.dateAvailableFrom.before(new Date()))
                if (el.getPrice() == price)
                    if (el.getPersons() == persons)
                        if (el.getCityName() == city)
                            if (el.getHotelName() == hotel)
                                count++;

        findedRooms = new Room[count];
        count = 0;
        for (Room el : rooms)
            if (el != null)
                //if (el.dateAvailableFrom!=null&&el.dateAvailableFrom.before(new Date()))
                if (el.getPrice()== price)
                    if (el.getPersons() == persons)
                        if (el.getCityName() == city)
                            if (el.getHotelName() == hotel) {
                                findedRooms[count] = el;
                                count++;
                            }
        return findedRooms;
    }

    @Override
    public Room[] getAll() {
        count = 0;
        for (Room el : rooms)
            if (el != null)
//                if (el.dateAvailableFrom.before(new Date()))
                count++;

        findedRooms = new Room[count];
        count = 0;
        for (Room el : rooms) {
            if (el != null){
//                if (el.dateAvailableFrom.before(new Date())) {
                findedRooms[count] = el;
                count++;
            }
        }
        return findedRooms;
    }

    @Override
    public String toString() {
        return "GoogleAPI{" +
                "rooms=" + Arrays.toString(rooms) +
                '}';
    }
}