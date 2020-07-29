
public class Passenger {

    private String name;
    private String lastname;

    public Passenger(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return this.name + " " + this.lastname;
    }

    public boolean equals() {
        if (this.name == name && this.lastname == lastname) {
            return true;
        }

        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}
