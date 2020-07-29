
import java.util.ArrayList;

public class Plane {

    private ArrayList<Seat> seats;
    private int rows;
    private int cols;
    String el;
    private String[] col = {"A", "B", "C", "D", "E", "F", "G", "H"};

    public Plane(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.seats = new ArrayList<>();
        this.el = "";

    }

    public void printLetters() {

        String el = "";

        for (int i = 0; i < this.cols; i++) {
            el = el + this.col[i];
        }
        System.out.println(el);

    }

    @Override
    public String toString() {

        System.out.println("Este es el mapa del avion: ");

        for (int i = 0; i < this.rows; i++) {
            System.out.print(i + 1 + " ");
            printLetters();

        }
        return "";
    }

    public void addSeat(Seat seat) {
        this.seats.add(seat);
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

}
