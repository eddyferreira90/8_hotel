package org.academia.bootcamp;

public class Hotel {

    private String name;
    private Client client;
    private Room[] rooms;



    public Hotel(String name, Room[] rooms, Client client){
        this.name = name;
        this.rooms = rooms;
        this.client = client;
    }

    public void checkIn(Client client, int id){

        for(int i = 0; i < rooms.length; i++){
            rooms[i].isAvailable();
            if(rooms[i].isAvailable() == true){
            System.out.println("We have this beautiful " + rooms[i].getRoomType() + " available for you! Enjoy!");
            rooms[i].setIsAvailable(false);
                System.out.println("(This " + rooms[i].getRoomType() + " is not available anymore!)");
                return;

            }else {
                System.out.println("Sorry, we don't have this room available anymore!");
            }
        }

    }


    /*public void checkOut(Client client, int id) {

            if(rooms[i].isAvailable() == false){
                rooms[i].setIsAvailable();

            }

    }*/

}
