import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import reservacion.Cliente;
import reservacion.Habitacion;
import reservacion.Reserva;

public class SistemaReservaHotel {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Habitacion> habitaciones = new ArrayList<>();
        habitaciones.add(new Habitacion(101, 100.0));
        habitaciones.add(new Habitacion(102, 120.0));
        habitaciones.add(new Habitacion(103, 150.0));

        Cliente cliente = null;
        Reserva reserva = null;

        while (true) {
            System.out.println("Reserva de Hotel");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Realizar Reserva");
            System.out.println("3. Mostrar Reserva");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del Cliente: ");
                    String nombreCliente = scanner.nextLine();
                    System.out.print("Teléfono del Cliente: ");
                    String telefonoCliente = scanner.nextLine();
                    cliente = new Cliente(nombreCliente, telefonoCliente);
                    System.out.println("Cliente registrado.");
                    break;

                case 2:
                    if (cliente == null) {
                        System.out.println("Debes registrar un cliente primero.");
                        break;
                    }

                    System.out.println("Selecciona una habitacion:");
                    for (int i = 0; i < habitaciones.size(); i++) {
                        System.out.println((i + 1) + ". " + habitaciones.get(i));
                    }
                    int opcionHabitacion = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consumir la nueva línea

                    if (opcionHabitacion < 0 || opcionHabitacion >= habitaciones.size()) {
                        System.out.println("Habitación no valida.");
                        break;
                    }

                    Habitacion habitacion = habitaciones.get(opcionHabitacion);

                    System.out.print("Fecha de Entrada (YYYY-MM-DD): ");
                    LocalDate fechaEntrada = LocalDate.parse(scanner.nextLine());
                    System.out.print("Fecha de Salida (YYYY-MM-DD): ");
                    LocalDate fechaSalida = LocalDate.parse(scanner.nextLine());

                    reserva = new Reserva(cliente, habitacion, fechaEntrada, fechaSalida);
                    System.out.println("Reserva realizada.");
                    break;

                case 3:
                    if (reserva == null) {
                        System.out.println("No hay reservas para mostrar.");
                        break;
                    }
                    System.out.println("Detalles de la Reserva:");
                    System.out.println(reserva);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no valida.");
            }
        }
    }
}
