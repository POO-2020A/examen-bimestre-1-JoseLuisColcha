
import java.util.Scanner;


public class IngresarName {

    public IngresarName() {
    }

    public void insertarDatos() {
        Scanner s = new Scanner(System.in);
        System.out.println("Inngrese nombre del pasajero");
        String name = s.nextLine();
        System.out.println("Inngrese apellido del pasajero");
        String lastname = s.nextLine();
        Passenger pass = new Passenger(name, lastname);
    }

}
