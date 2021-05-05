package Classes;

import Interfaces.*;

// Abstract class
// Polymorphism
public abstract class Department implements PassengerInterface, WorkerInterface {

    // Overriding
    public boolean AddPassenger(Passenger P) {
        return false;
    }

    public boolean RemovePassenger(Passenger P) {
        return false;
    }

    public void ShowAllPassenger() {
    }

    public Passenger searchPassenger(int nameCode) {
        return null;
    }

    public boolean AddWorker(Worker W) {
        return false;
    }

    public boolean RemoveWorker(Worker W) {
        return false;
    }

    public void ShowAllWorker() {
    }

    public Worker searchWorker(int ID) {
        return null;
    }
}