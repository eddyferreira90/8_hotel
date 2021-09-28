package org.academia.bootcamp;

public class Room {

    private String roomType;
    private int roomNumber;
    private boolean isAvailable;


    public Room(String roomType, int roomNumber,boolean isAvailable){
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.isAvailable = isAvailable;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
