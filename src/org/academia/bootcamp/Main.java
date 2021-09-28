package org.academia.bootcamp;

public class Main {

    public static void main (String[] args){

        Room[] rooms = new Room[] {
                new Room("Medium Room", 1, true),
                new Room("Big Room", 2,true),
                new Room("Very Big Room", 3,true),
        };
        Client ze = new Client("Zé", 1 );
        Client nuno = new Client("nuno", 2);
        Hotel hotel = new Hotel("Hotel", rooms, ze);


        hotel.checkIn(ze, 2);







    }
}
