package Classes;

public class Worker {

    private String Wname;
    private int id;
    private int Wage;
    private String Waddress;
    private int WphoneNumber;
    private String Wgender;

    public void setName(String name) {
        this.Wname = name;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.Wage = age;
    }

    public void setAddress(String address) {
        this.Waddress = address;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.WphoneNumber = phoneNumber;
    }

    public void setGender(String gender) {
        this.Wgender = gender;
    }

    public String getName() {
        return Wname;
    }

    public int getID() {
        return id;
    }

    public int getAge() {
        return Wage;
    }

    public String getAddress() {
        return Waddress;
    }

    public int getPhoneNumber() {
        return WphoneNumber;
    }

    public String getGender() {
        return Wgender;
    }
}