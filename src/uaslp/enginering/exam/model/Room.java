package uaslp.enginering.exam.model;

;

public class Room {

    private int roomNumber;
    private String beds;
    private RoomStatus roomStatus;

    public Room(int roomNumber, String beds, RoomStatus roomStatus){
        this.roomNumber = roomNumber;
        this.beds = beds;
        this.roomStatus = roomStatus;
    }

    public int getNumber(){
        return roomNumber;
    }

    public RoomStatus getStatus(){
        return roomStatus;
    }
}
