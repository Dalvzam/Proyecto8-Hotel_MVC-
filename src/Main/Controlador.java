package Main;

import java.sql.Date;

import Main.GestorClientes;
import Main.GestorHabitaciones;
import Main.GestorReservas;

public class Controlador {
    GestorClientes gestorClientes = new GestorClientes();
    GestorHabitaciones gestorHabitaciones = new GestorHabitaciones();
    GestorReservas gestorReservas = new GestorReservas();

    public Controlador() {

    }

    public Controlador(GestorClientes gestorClientes, GestorHabitaciones gestorHabitaciones,
            GestorReservas gestorReservas) {
        this.gestorClientes = gestorClientes;
        this.gestorHabitaciones = gestorHabitaciones;
        this.gestorReservas = gestorReservas;
    }

    public void aniadirHabitacion(int id, String tipo, float precioPorNoche) {
        gestorHabitaciones.aniadirHabitacion(id, tipo, precioPorNoche);
    }

    public void listarHabitaciones() {
        gestorHabitaciones.listarHabitaciones();
    }

    public void eliminarHabitacionPorCliente(String nombreCliente) {
        gestorReservas.busquedaPorCliente(nombreCliente);
    }

    public void registrarCliente() {
        gestorClientes.aniadirCliente();
    }

    public void listarClientes() {
        gestorClientes.listarClientes();
    }

    public void eliminarCliente(int idBuscado) {
        gestorClientes.eliminarClientePorID(idBuscado);
    }

    public void aniadirReserva(int idReserva,int IdHabitacion,int total) {
        gestorReservas.aniadirReserva(idReserva,IdHabitacion,total);
    }

    public void listarReserva() {
        gestorReservas.listarReserva();
    }

    public void borrarReserva(int idReservaBuscada) {
        gestorReservas.borrarReserva(idReservaBuscada);
    }

    public void buscarReservasClienteOHabitacion() {
        gestorReservas.buscarReservasClienteOHabitacion();
    }
}
