package Classes;

public class Flightes {

    public String name;
    public String Code;
    public String source;
    public String destination;
    public String time;

    public void SetDetails(String name, String Code, String time, String source, String destination) {

        this.name = name;
        this.Code = Code;
        this.time = time;
        this.source = source;
        this.destination = destination;
    }

    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.Code;
    }

    public String getSource() {
        return this.source;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getTime() {
        return this.time;
    }

    public void ShowFlightesName() {

        System.out.println(
                "\n\t|``````````````````````````````````````````````````````````````````````````````````````|");
        System.out.println("\t|   " + "Flight Name" + "\t   " + "Flight Code" + "\t\t" + "Source" + "\t\t"
                + "Destination" + "\t" + "Flight Time    |");
        System.out
                .println("\t|______________________________________________________________________________________|");

    }

    public void ShowFlightes() {

        System.out.println("\t|     " + this.name + "\t     " + this.Code + "\t\t" + this.source + "\t\t"
                + this.destination + "\t\t " + this.time + "      |");
        System.out
                .println("\t|______________________________________________________________________________________|");
    }
}