package Interfaces;

import Classes.Passenger;

public interface PassengerInterface {

    boolean AddPassenger(Passenger P);

    boolean RemovePassenger(Passenger P);

    void ShowAllPassenger();

    Passenger searchPassenger(int codeName);
}