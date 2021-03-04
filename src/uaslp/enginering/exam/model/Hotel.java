package uaslp.enginering.exam.model;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Reservation> reservations;
    private ArrayList<Room> rooms;

    private String name;
    private int pools;
    private int gyms;

    public Hotel() {
        reservations = new ArrayList<>();
    }

    public Hotel(String name){
        this.name = name;
        this.rooms = new ArrayList<Room>();
        reservations = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public int getPools() {
        return pools;
    }

    public void setPools(int pools) {
        this.pools = pools;
    }

    public int getGyms() {
        return gyms;
    }

    public void setGyms(int gyms) {
        this.gyms = gyms;
    }

    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nights) {
        Reservation reservation = new Reservation();

        reservation.setRoomNumber(roomNumber);
        reservation.setArrivalDate(arrivalDate);
        reservation.setGuest(guest);
        reservation.setNights(nights);

        reservations.add(reservation);
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public ArrayList<Room> getRooms(){
        return rooms;
    }
}
