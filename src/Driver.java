public class Driver {
    public int getCash() {
        return Cash;
    }

    public void setCash(int cash) {
        Cash = cash;
    }

    public int Cash;
    public String Surname;
    public String Name;

    public Driver(int cash, String surname, String name) {
        Cash = cash;
        Surname = surname;
        Name = name;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "Cash=" + Cash +
                ", Surname='" + Surname + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }
}
