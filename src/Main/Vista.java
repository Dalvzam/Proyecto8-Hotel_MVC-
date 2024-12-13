package Main;
import java.util.Scanner;
import Main.Controlador;


public class Vista {
    Scanner scanner = new Scanner(System.in);
    //Controlador controlador = new Controlador();

    public void mostrarMensaje(String string){
        System.out.println(string);
    }
    public String leerTexto(String mensaje) {
        scanner.nextLine();
        System.out.print(mensaje);
        return scanner.nextLine();
    }
    public int leerEntero(String mensaje){
        scanner.nextLine();
        System.out.print(mensaje);
        return scanner.nextInt();
    }
    
    public void main(String[] args) {
        Controlador controlador = new Controlador();
        int option;

        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Añadir habitación");
            System.out.println("2. Listar habitaciones");
            System.out.println("3. Eliminar habitación");
            System.out.println("4. Registrar cliente");
            System.out.println("5. Listar clientes");
            System.out.println("6. Eliminar cliente");
            System.out.println("7. Crear reserva");
            System.out.println("8. Listar reservas");
            System.out.println("9. Cancelar reserva");
            System.out.println("10. Buscar reservas por cliente o habitación");
            System.out.println("11. Salir del sistema");
            System.out.print("Seleccione una opción: ");

            option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    // Añadir habitación
                    System.out.println("Introduce ID_: ");
                    int id = scanner.nextInt();
                    System.out.println("Introduce Tipo_: ");
                    String tipo = scanner.next();
                    System.out.println("Introduce Precio Por Noche_: ");
                    float precioPorNoche = scanner.nextFloat();
                    controlador.aniadirHabitacion(id,tipo,precioPorNoche);
                }
                case 2 -> {
                    // Listar habitaciones
                    controlador.listarHabitaciones();
                }
                case 3 -> {
                    // Eliminar habitación
                    System.out.println("Introduce el nombre del cliente_: ");
                    String nombreClienteBuscado = scanner.next();
                    controlador.eliminarHabitacionPorCliente(nombreClienteBuscado);
                }
                case 4 -> {
                    // Registrar cliente
                    controlador.registrarCliente();
                }
                case 5 -> {
                    // Listar clientes
                    controlador.listarClientes();
                }
                case 6 -> {
                    // Eliminar cliente
                    System.out.println("Introduce el id del cliente_: ");
                    int idBuscado = scanner.nextInt();
                    controlador.eliminarCliente(idBuscado);
                }
                case 7 -> {
                    // Crear reserva
                    System.out.println("Introduce ID de la reserva_: ");
                    int idReserva = scanner.nextInt();
                    System.out.println("Introduce ID de la habitacion: ");
                    int IdHabitacion = scanner.nextInt();
                    System.out.println("Introduce ID del total: ");
                    int total = scanner.nextInt();
                    controlador.aniadirReserva(idReserva,IdHabitacion,total);
                }
                case 8 -> {
                    // Listar reservas
                    controlador.listarReserva();
                }
                case 9 -> {
                    // Cancelar reserva
                    System.out.println("Introduce el id de la reserva_: ");
                    int idReservaBuscada = scanner.nextInt();
                    controlador.borrarReserva(idReservaBuscada);
                }
                case 10 -> {
                    // Buscar reservas por cliente o habitación
                    controlador.buscarReservasClienteOHabitacion();
                }
                case 11 -> System.out.println("Saliendo del sistema. ¡Hasta luego!");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (option != 11);

        scanner.close();
    }
}
