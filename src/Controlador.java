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
}
