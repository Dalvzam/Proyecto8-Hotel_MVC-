public class Controlador {
    GestorClientes gestorClientes = new GestorClientes();
    GestorHabitaciones gestorHabitaciones = new GestorHabitaciones();
    GestorReservas gestorReservas = new GestorReservas();

    public Controlador(GestorClientes gestorClientes, GestorHabitaciones gestorHabitaciones,
            GestorReservas gestorReservas) {
        this.gestorClientes = gestorClientes;
        this.gestorHabitaciones = gestorHabitaciones;
        this.gestorReservas = gestorReservas;
    }

    public void aniadirHabitacion(){
        gestorHabitaciones.aniadirHabitacion();
    }

    public void listarHabitaciones(){
        gestorHabitaciones.listarHabitaciones();
    }

    
    public void eliminarHabitacionPorCliente(String nombreCliente) {
        gestorReservas.busquedaPorCliente(nombreCliente);
	}
    
    public void registrarCliente(){
        gestorClientes.aniadirCliente();
    }
    
    public void listarClientes(){
        gestorClientes.listarClientes();
    }

    public void eliminarCliente(int idBuscado){
        gestorClientes.eliminarClientePorID(idBuscado);
    }

    public void aniadirReserva(){
        gestorReservas.aniadirReserva();
    }

    public void listarReserva(){
        gestorReservas.listarReserva();
    }

    public void borrarReserva(int idReservaBuscada){
        gestorReservas.borrarReserva(idReservaBuscada);
    }

    public void buscarReservasClienteOHabitacion(){
        gestorReservas.buscarReservasClienteOHabitacion();
    }
}
