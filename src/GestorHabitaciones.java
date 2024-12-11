import java.util.ArrayList;

public class GestorHabitaciones {
    ArrayList<Habitacion> listaHabitaciones = new ArrayList<>();
    Vista vista = new Vista();
    private void aniadirHabitacion(){
        Habitacion habitacion = new Habitacion();
        listaHabitaciones.add(habitacion);
    }
    private void listarHabitaciones(){
        for (Habitacion habitacion : listaHabitaciones) {
            vista.mostrarMensaje(habitacion.toString());
        }
    }
    private void eliminarHabitacion(Habitacion habitacion){
        for (Habitacion habitacionPuntero : listaHabitaciones) {
            if (habitacion.equals(habitacionPuntero)){
                listaHabitaciones.remove(habitacionPuntero);
            }
        }
    }
}
