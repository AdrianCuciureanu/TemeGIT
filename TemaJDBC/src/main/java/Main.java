import dao.BookingDAOImplementation;
import db.BookingDB;
import model.Accomodation;
import model.AccomodationFairRelation;
import model.RoomFair;
import model.RoomPrice;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        BookingDB bookingDB = new BookingDB();
        BookingDAOImplementation bookingDAOImplementation = new BookingDAOImplementation(bookingDB);
        bookingDAOImplementation.clearAllTables();
        initializeAccomodationTable();
        initializeRoomFairTable();
        initializeAccomodationFairRelationTable();

        List<RoomPrice> list = bookingDAOImplementation.readRoomsPrices();
        list.forEach(System.out::println);

    }

    public static void initializeAccomodationTable() {
        BookingDB bookingDB = new BookingDB();
        BookingDAOImplementation bookingDAOImplementation = new BookingDAOImplementation(bookingDB);
        bookingDAOImplementation.insertIntoAccomodation(new Accomodation("Double", "1 x double", 2, "bla bla double"));
        bookingDAOImplementation.insertIntoAccomodation(new Accomodation("Double-Single", "2 x regular", 2, "bla bla 2 x regular"));
        bookingDAOImplementation.insertIntoAccomodation(new Accomodation("Appartment", "1 x double + 1 couch", 2, "bla bla appartment"));
    }

    public static void initializeRoomFairTable() {
        BookingDB bookingDB = new BookingDB();
        BookingDAOImplementation bookingDAOImplementation = new BookingDAOImplementation(bookingDB);
        bookingDAOImplementation.insertIntoRoomFair(new RoomFair(80, "Winter"));
        bookingDAOImplementation.insertIntoRoomFair(new RoomFair(100, "Spring-Autumn"));
        bookingDAOImplementation.insertIntoRoomFair(new RoomFair(150, "Summer"));
        bookingDAOImplementation.insertIntoRoomFair(new RoomFair(120, "Winter"));
        bookingDAOImplementation.insertIntoRoomFair(new RoomFair(180, "Spring-Autumn"));
        bookingDAOImplementation.insertIntoRoomFair(new RoomFair(250, "Summer"));
    }

    public static void initializeAccomodationFairRelationTable() {
        BookingDB bookingDB = new BookingDB();
        BookingDAOImplementation bookingDAOImplementation = new BookingDAOImplementation(bookingDB);
        bookingDAOImplementation.insertIntoAccomodationFairRelation(new AccomodationFairRelation(1, 1));
        bookingDAOImplementation.insertIntoAccomodationFairRelation(new AccomodationFairRelation(1, 2));
        bookingDAOImplementation.insertIntoAccomodationFairRelation(new AccomodationFairRelation(1, 3));
        bookingDAOImplementation.insertIntoAccomodationFairRelation(new AccomodationFairRelation(2, 1));
        bookingDAOImplementation.insertIntoAccomodationFairRelation(new AccomodationFairRelation(2, 2));
        bookingDAOImplementation.insertIntoAccomodationFairRelation(new AccomodationFairRelation(2, 3));
        bookingDAOImplementation.insertIntoAccomodationFairRelation(new AccomodationFairRelation(3, 4));
        bookingDAOImplementation.insertIntoAccomodationFairRelation(new AccomodationFairRelation(3, 5));
        bookingDAOImplementation.insertIntoAccomodationFairRelation(new AccomodationFairRelation(3, 6));
    }


}
