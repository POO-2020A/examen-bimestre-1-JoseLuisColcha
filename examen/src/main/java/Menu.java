
import java.util.Scanner;

public class Menu {

    public Menu() {
    }

    public void imprimir() {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas: ");
        int row = Integer.valueOf(s.nextLine());
        System.out.println("Ingrese la cantidad de columnas: ");
        int col = Integer.valueOf(s.nextLine());
        Plane plane = new Plane(row, col);
        System.out.println(plane.toString());

        while (true) {
            System.out.println("Que desea hacer ? ");
            System.out.println("1.Ingresar pasajero");
            System.out.println("2.Consultar asiento");
            System.out.println("3.Consultar pasajero");
            int op = Integer.valueOf(s.nextLine());

            switch (op) {
                case 1: {
                    IngresarName inName = new IngresarName();
                    inName.insertarDatos();

                    System.out.println("Ingrese la fila del asiento:");
                    int fil = Integer.valueOf(s.nextLine());
                    System.out.println("Ingrese la columna del asiento:");
                    String colu = s.nextLine();
                    Seat seat = new Seat(fil, colu);
                    plane.addSeat(seat);
                    System.out.println(plane);
                }
                break;
                case 2: {
                    System.out.println("Ingrese la fila del asiento:");
                    int fil = Integer.valueOf(s.nextLine());
                    System.out.println("Ingrese la columna del asiento:");
                    String colu = s.nextLine();

                    Seat seat = new Seat(fil, colu);

                    if (seat.equals()) {
                        System.out.println(seat.toString());

                    } else {
                        System.out.println("El usuario no esta en el avion");

                    }
                    System.out.println(plane);
                }
                break;
                case 3: {
                    System.out.println("Ingrese nombre del pasajero");
                    String name = s.nextLine();
                    System.out.println("Ingrese apellido del pasajero");
                    String lastname = s.nextLine();
                    Passenger pass = new Passenger(name, lastname);

                    if (pass.equals()) {
                        System.out.println(pass.toString());

                    } else {
                        System.out.println("El usuario no esta en el avion");

                    }
                    System.out.println(plane);
                }
                break;

            }

        }
    }

}
