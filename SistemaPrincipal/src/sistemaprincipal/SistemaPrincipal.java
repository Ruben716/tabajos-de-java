/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaprincipal;

/**
 *
 * @author ACER
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear algunas habitaciones y servicios de ejemplo
        List<Habitacion> habitaciones = new ArrayList<>();
        habitaciones.add(new Habitacion("Simple", 50));
        habitaciones.add(new Habitacion("Doble", 80));
        habitaciones.add(new Habitacion("Suite", 150));

        List<Servicio> servicios = new ArrayList<>();
        servicios.add(new Servicio("Spa", 30));
        servicios.add(new Servicio("Restaurante", 20));
        servicios.add(new Servicio("Gimnasio", 15));

        // Variables para almacenar los datos de la reserva
        Persona persona = null;
        Habitacion habitacionSeleccionada = null;
        List<Servicio> serviciosSeleccionados = new ArrayList<>();
        String fechaIngreso = "";
        String fechaSalida = "";

        int opcion = 0;
        do {
            System.out.println("\n--- Menu de Reservas ---");
            System.out.println("1. Ingresar datos de la persona");
            System.out.println("2. Seleccionar habitacion");
            System.out.println("3. Seleccionar servicios");
            System.out.println("4. Ingresar fechas de ingreso y salida");
            System.out.println("5. Mostrar resumen de la reserva");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Ingresar los datos de la persona
                    System.out.println("\n--- Ingresar Datos de la Persona ---");
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("DNI: ");
                    String dni = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    persona = new Persona(nombre, dni, email);
                    System.out.println("Datos de la persona registrados correctamente.");
                    break;

                case 2:
                    // Seleccionar una habitación
                    System.out.println("\n--- Seleccionar Habitacion ---");
                    for (int i = 0; i < habitaciones.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        habitaciones.get(i).mostrarHabitacion();
                    }
                    System.out.print("Seleccione el numero de la habitacion: ");
                    int numHabitacion = scanner.nextInt();
                    habitacionSeleccionada = habitaciones.get(numHabitacion - 1);
                    habitacionSeleccionada.reservar();
                    System.out.println("Habitacion seleccionada correctamente.");
                    break;

                case 3:
                    // Seleccionar servicios
                    System.out.println("\n--- Seleccionar Servicios ---");
                    for (int i = 0; i < servicios.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        servicios.get(i).mostrarServicio();
                    }
                    System.out.println("Seleccione los numeros de los servicios (separados por comas, o 0 si no quiere):");
                    String seleccionServicios = scanner.nextLine();
                    String[] serviciosIds = seleccionServicios.split(",");
                    serviciosSeleccionados.clear(); // Limpiar selección previa
                    for (String id : serviciosIds) {
                        int index = Integer.parseInt(id) - 1;
                        //asegura que el índice calculado esté dentro del rango válido de la lista de servicios
                        if (index >= 0 && index < servicios.size()) {
                            serviciosSeleccionados.add(servicios.get(index));
                        }
                    }
                    System.out.println("Servicios seleccionados correctamente.");
                    break;

                case 4:
                    // Ingresar fechas de ingreso y salida
                    System.out.println("\n--- Ingresar Fechas ---");
                    System.out.print("Fecha de ingreso (dd/mm/yyyy): ");
                    fechaIngreso = scanner.nextLine();
                    System.out.print("Fecha de salida (dd/mm/yyyy): ");
                    fechaSalida = scanner.nextLine();
                    System.out.println("Fechas registradas correctamente.");
                    break;

                case 5:
                    // Mostrar el resumen de la reserva
                    if (persona != null && habitacionSeleccionada != null && !fechaIngreso.isEmpty() && !fechaSalida.isEmpty()) {
                        Reserva reserva = new Reserva(persona, habitacionSeleccionada, serviciosSeleccionados, fechaIngreso, fechaSalida);
                        System.out.println("\n--- Resumen de la Reserva ---");
                        reserva.mostrarReserva();
                    } else {
                        System.out.println("Debe completar todos los datos antes de mostrar el resumen.");
                    }
                    break;

                case 6:
                    // Salir
                    System.out.println("Saliendo del sistema.");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}

