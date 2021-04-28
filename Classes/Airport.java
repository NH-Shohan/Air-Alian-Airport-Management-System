package Classes;

public class Airport extends Department {

    private Passenger passengers[] = new Passenger[10000];// Object Array
    private Worker workers[] = new Worker[1000];

    public boolean AddPassenger(Passenger P) {
        boolean pass = false;
        for (int i = 0; i < passengers.length; i++) {

            if (passengers[i] == null) {
                passengers[i] = P;
                pass = true;
                break;
            }
        }
        return pass;
    }

    public boolean RemovePassenger(Passenger P) {
        boolean Pass = false;
        for (int i = 0; i < passengers.length; i++) {

            if (passengers[i] == P) {
                passengers[i] = null;
                Pass = true;
                break;
            }
        }
        return Pass;
    }

    public void ShowAllPassenger() {
        for (int i = 0; i < passengers.length; i++) {

            if (passengers[i] != null) {
                System.out.println("The " + (i + 1) + " Passenger name is            : " + passengers[i].getName());
                System.out.println("The " + (i + 1) + " Passenger age is             : " + passengers[i].getAge());
                System.out.println("The " + (i + 1) + " Passenger address is         : " + passengers[i].getAddress());
                System.out.println(
                        "The " + (i + 1) + " Passenger passport number is : " + passengers[i].getPassportNumber());
                System.out.println(
                        "The " + (i + 1) + " Passenger phone number is    : " + passengers[i].getPhoneNumber());
                System.out.println("The " + (i + 1) + " Passenger gender is          : " + passengers[i].getGender());
                System.out.println(
                        "The " + (i + 1) + " Passenger nationality is     : " + passengers[i].getNationality());
                System.out.println(
                        "\nThe " + (i + 1) + " Passenger's Code is          : " + passengers[i].getCodeName() + "\n");
            }
        }
    }

    public Passenger searchPassenger(int nameCode) {
        Passenger P = null;

        for (int i = 0; i < passengers.length; i++) {

            if (passengers[i] != null) {
                if (passengers[i].getCodeName() == nameCode) {
                    P = passengers[i];
                    break;
                }
            }
        }
        return P;
    }

    public boolean AddWorker(Worker W) {
        boolean pass = false;
        for (int i = 0; i < workers.length; i++) {

            if (workers[i] == null) {
                workers[i] = W;
                pass = true;
                break;
            }
        }
        return pass;
    }

    public boolean RemoveWorker(Worker W) {
        boolean pass = false;
        for (int i = 0; i < workers.length; i++) {

            if (workers[i] == W) {
                workers[i] = null;
                pass = true;
            }
        }
        return pass;
    }

    public void ShowAllWorker() {
        for (int i = 0; i < workers.length; i++) {

            if (workers[i] != null) {
                System.out.println("\n" + (i + 1) + " Worker ID is           : " + workers[i].getID());
                System.out.println("\n" + (i + 1) + " Worker Name is         : " + workers[i].getName());
                System.out.println((i + 1) + " Worker Age is          : " + workers[i].getAge());
                System.out.println((i + 1) + " Worker Address is      : " + workers[i].getAddress());
                System.out.println((i + 1) + " Worker Phone Number is : " + workers[i].getPhoneNumber());
                System.out.println((i + 1) + " Worker Gender is       : " + workers[i].getGender());
            }
        }
    }

    public Worker searchWorker(int ID) {
        Worker w = null;

        for (int i = 0; i < workers.length; i++) {

            if (workers[i] != null) {
                if (workers[i].getID() == ID) {
                    w = workers[i];
                    break;
                }
            }
        }
        return w;
    }
}
