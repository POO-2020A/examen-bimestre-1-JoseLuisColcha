
import java.util.ArrayList;

public class Seat {

    private int row;
    private String col;
    private Passenger passenger;

    public Seat(int row, String col) {
        this.row = row;
        this.col = col;
    }

    public boolean isFree() {
        if (this.passenger == null) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (this.passenger == null) {
            return "Asiento: " + this.row + "" + this.col + " libre.Pasajero: " + this.passenger.getName() + " " + this.passenger.getLastname();
        }
        return "Asiento: " + this.row + "" + this.col + " ocupado.Pasajero: " + this.passenger.getName() + " " + this.passenger.getLastname();
    }

    public boolean equals() {
        if (this.col == col && this.row == row) {
            return true;
        }
        return false;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

}
